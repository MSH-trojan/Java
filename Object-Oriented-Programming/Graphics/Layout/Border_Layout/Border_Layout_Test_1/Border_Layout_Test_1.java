package border_layout_test_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Border_Layout_Test_1 extends JFrame {
   private JLabel label;
   private JTextField t1, t2;
   private JPasswordField p1;
   private JButton plainButton;

   public Border_Layout_Test_1()   {
      super( "Testing GUI Components" );
      Container container = getContentPane();
      container.setLayout( new BorderLayout(5,5) );
      label = new JLabel( "Testing JLabel" );
      label.setToolTipText( "Label with text" ); 
      container.add( label , BorderLayout.NORTH);
      t1 = new JTextField( 10 );
      t2 = new JTextField( "Enter text here" );
      container.add( t1, BorderLayout.EAST );
      container.add( t2, BorderLayout.WEST );
      p1 = new JPasswordField( 10 );
      container.add( p1, BorderLayout.SOUTH );
      plainButton = new JButton( "Plain Button" );
      container.add( plainButton, BorderLayout.CENTER );   

// Create instances of inner classes for event handling                  //  the event listeners
      TextFieldHandler h1 = new TextFieldHandler ();

// Registers the event listeners with the event sources
      t1.addActionListener( h1 );
      t2.addActionListener( h1 );
      p1.addActionListener( h1 );

 
 
// For button use a no-name event listener
     plainButton.addActionListener(
           new ActionListener () {  
                 public void actionPerformed( ActionEvent event ){
   JOptionPane.showMessageDialog( null,"You pressed: " +   
                  event.getActionCommand());
                   		}
            		}
    		 );
      setSize( 275, 100 );
      setVisible( true );
   }  // end of constructor

   // inner class for textfield event handling
   private class TextFieldHandler implements ActionListener {
      public void actionPerformed( ActionEvent event ){
         String s = "";
         if (event.getSource() == t1)
         s = "textfield 1 has: " + event.getActionCommand() ;
         else if (event.getSource() == t2)
         s = "textfield 2 has: " + event.getActionCommand() ;
         else if (event.getSource() == p1)
         s = "password field  has: " + event.getActionCommand() ;
                 JOptionPane.showMessageDialog( null, s );
      }
   }

public static void main( String args[] )   { 
      Border_Layout_Test_1 application = new Border_Layout_Test_1();
  application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

}  // end class Test

