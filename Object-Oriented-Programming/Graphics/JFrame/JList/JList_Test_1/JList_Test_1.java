package jList_Test;

//ListTest.java
//Selecting colors from a JList.

//Java core packages
import java.awt.*;

//Java extension packages
import javax.swing.*;
import javax.swing.event.*;

public class JList_Test_1 extends JFrame {
private JList colorList;
private Container container;

private String colorNames[] = { "Black", "Blue", "Cyan", 
   "Dark Gray", "Gray", "Green", "Light Gray", "Magenta",
   "Orange", "Pink", "Red", "White", "Yellow" };

private Color colors[] = { Color.black, Color.blue, 
   Color.cyan, Color.darkGray, Color.gray, Color.green,
   Color.lightGray, Color.magenta, Color.orange, Color.pink,
   Color.red, Color.white, Color.yellow };

// set up GUI
public JList_Test_1()
{
   super( "List Test" );

   // get content pane and set its layout
   container = getContentPane();
   container.setLayout( new FlowLayout() );

   // create a list with items in colorNames array
   colorList = new JList( colorNames );
   colorList.setVisibleRowCount( 5 );
   
   // do not allow multiple selections
   colorList.setSelectionMode(
      ListSelectionModel.SINGLE_SELECTION );

   // add a JScrollPane containing JList to content pane
   container.add( new JScrollPane( colorList ) );

   // set up event handler
   colorList.addListSelectionListener(

      // anonymous inner class for list selection events
      new ListSelectionListener() {

         // handle list selection events
         public void valueChanged( ListSelectionEvent event )
         {
            container.setBackground(
               colors[ colorList.getSelectedIndex() ] );
         }

      }  // end anonymous inner class

   ); // end call to addListSelectionListener

   setSize( 350, 150 );
   setVisible( true );
}

// execute application
public static void main( String args[] )
{ 
   JList_Test_1 application = new JList_Test_1();
   application.setDefaultCloseOperation(
      JFrame.EXIT_ON_CLOSE );
}

}  // end class ListTest

