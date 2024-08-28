package s1;

import javax.swing.*;                                                 
import java.awt.*;
import java.awt.event.*;

public class Test extends JFrame {
private JLabel label;
private JTextField t1, t2;
private JPasswordField p1;
private JButton plainButton;


public Test()    {
super( "Testing GUI Components" );
Container container = getContentPane();                
container.setLayout( new FlowLayout() );

label = new JLabel( "Testing JLabel" );
label.setToolTipText( "Label with text" ); 
container.add( label );

t1 = new JTextField( 10 );
t2 = new JTextField( "Enter text here" );
//if you add the line t2.setEditable(false) the object t2 will be like a label
container.add( t1 );
container.add( t2 );

p1 = new JPasswordField( 10 );
container.add( p1 );

plainButton = new JButton( "Plain Button" );
container.add( plainButton );


//Create instances of inner classes for event handling - the event listeners
TextFieldHandler h1 = new TextFieldHandler ();                  
//Registers the event listeners with the event sources
t1.addActionListener( h1 );
t2.addActionListener( h1 );                                                 
p1.addActionListener( h1 );
//An alternative to inner classes is to create a no-name event listener
plainButton.addActionListener(
         new ActionListener () {  
public void actionPerformed( ActionEvent event ){
         JOptionPane.showMessageDialog( null,
                                "You pressed: " + event.getActionCommand() );
           }
}
);
setSize( 275, 150 );
setVisible( true );
}

// execute application
public static void main( String args[] )   { 
Test application = new Test();
application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}


// inner class for textfield event handling
private class TextFieldHandler implements ActionListener {         
public void actionPerformed( ActionEvent event ){
 String s = "";
if (event.getSource() == t1)   
s = "textfield  1 has: " + event.getActionCommand() ;	
else if (event.getSource() == t2)
s = "textfield 2 has: " + event.getActionCommand() ;
else if (event.getSource() == p1)
s = "password field  has: " + event.getActionCommand() ;
JOptionPane.showMessageDialog( null, s );
}
}

}  // end class Test

