package jcombo_box_test_1;

// Java core packages
import java.awt.*;
import java.awt.event.*;

// Java extension packages
import javax.swing.*;

public class JCombo_Box_Test_1 extends JFrame {
   private JComboBox imagesComboBox;
   private JLabel label;

   private String names[] =
      { "bug1.gif", "bug2.gif",  "travelbug.gif", "buganim.gif" };
   private Icon icons[] = { new ImageIcon( names[ 0 ] ),
      new ImageIcon( names[ 1 ] ), new ImageIcon( names[ 2 ] ),
      new ImageIcon( names[ 3 ] ) };

   // set up GUI
   public JCombo_Box_Test_1()
   {
      super( "Testing JComboBox" );
   
      // get content pane and set its layout
      Container container = getContentPane();
      container.setLayout( new FlowLayout() );      

      // set up JComboBox and register its event handler
      imagesComboBox = new JComboBox( names );
      imagesComboBox.setMaximumRowCount( 3 );

      imagesComboBox.addItemListener(
   
         // anonymous inner class to handle JComboBox events
         new ItemListener() {

            // handle JComboBox event
            public void itemStateChanged( ItemEvent event )
            {
               // determine whether check box selected
               if ( event.getStateChange() == ItemEvent.SELECTED )
                  label.setIcon( icons[ 
                     imagesComboBox.getSelectedIndex() ] );
            }

         }  // end anonymous inner class

      ); // end call to addItemListener

      container.add( imagesComboBox );

      // set up JLabel to display ImageIcons
      label = new JLabel( icons[ 0 ] );
      container.add( label );

      setSize( 350, 100 );
      setVisible( true );
   }

   // execute application
   public static void main( String args[] )
   { 
	   JCombo_Box_Test_1 application = new JCombo_Box_Test_1();

      application.setDefaultCloseOperation(
         JFrame.EXIT_ON_CLOSE );
   }

}  // end class ComboBoxTest

