package multipleselection;

//MultipleSelection.java
//Copying items from one List to another.

//Java core packages
import java.awt.*;
import java.awt.event.*;

//Java extension packages
import javax.swing.*;

public class MultipleSelection extends JFrame {
private JList colorList, copyList;
private JButton copyButton;

private String colorNames[] = { "Black", "Blue", "Cyan", 
   "Dark Gray", "Gray", "Green", "Light Gray", 
   "Magenta", "Orange", "Pink", "Red", "White", "Yellow" };

// set up GUI
public MultipleSelection()
{
   super( "Multiple Selection Lists" );

   // get content pane and set its layout
   Container container = getContentPane();
   container.setLayout( new FlowLayout() );

   // set up JList colorList
   colorList = new JList( colorNames );
   colorList.setVisibleRowCount( 5 );
   colorList.setFixedCellHeight( 15 );
   colorList.setSelectionMode(
      ListSelectionModel.MULTIPLE_INTERVAL_SELECTION );
   container.add( new JScrollPane( colorList ) );

   // create copy button and register its listener
   copyButton = new JButton( "Copy >>>" );

   copyButton.addActionListener(

      // anonymous inner class for button event
      new ActionListener() {

         // handle button event
         public void actionPerformed( ActionEvent event )
         {
            // place selected values in copyList
            copyList.setListData(
            		
            colorList.getSelectedValues() );
         }

      }  // end anonymous inner class

   ); // end call to addActionListener

   container.add( copyButton );

   // set up JList copyList
   copyList = new JList();
   copyList.setVisibleRowCount( 5 );
   copyList.setFixedCellWidth( 100 );
   copyList.setFixedCellHeight( 15 );
   copyList.setSelectionMode(
      ListSelectionModel.SINGLE_INTERVAL_SELECTION );
   container.add( new JScrollPane( copyList ) );

   setSize( 300, 120 );
   setVisible( true );
}

// execute application
public static void main( String args[] )
{ 
   MultipleSelection application = new MultipleSelection();

   application.setDefaultCloseOperation(
      JFrame.EXIT_ON_CLOSE );
}

}  // end class MultipleSelection

