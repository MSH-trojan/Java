package testareademo;

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 

public class TextAreaDemo extends JFrame implements ActionListener{ 
  private JTextArea t1, t2;      
  
  private JButton copy; 
  
  public static void main( String args[] ) {   TextAreaDemo app = new TextAreaDemo(); }

  public TextAreaDemo() { 
    super( "TextArea Demo" );
    setSize( 425, 200 ); 
    setVisible(true);
    
    Box b = Box.createHorizontalBox();   // Box object on top of the Container

    String s = "This is a demo string to\n" + 
          "illustrate copying text\n" + "from one TextArea to \n" +
             "another TextArea using an\n" +  "external event\n"; 
     t1 = new JTextArea( s, 10, 15 ); 
     b.add( new JScrollPane( t1 ) ); 
     copy = new JButton( "Copy >>>" ); 
     
     b.add( copy ); 
     t2 = new JTextArea( 10, 15 ); 
     t2.setEditable( false ); 
     b.add( new JScrollPane( t2 ) ); 

     Container c = getContentPane(); 
     c.add(b);           // Box placed on the Container
     
     copy.addActionListener(this);
     }
             
    public void actionPerformed( ActionEvent e ){
      
    	t2.setText( t1.getSelectedText() );  }
}
   
