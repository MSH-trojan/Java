package flow_layout_demo_1;

//FlowLayoutDemo.java
//Demonstrating FlowLayout alignments.

//Java core packages
import java.awt.*;
import java.awt.event.*;

//Java extension packages
import javax.swing.*;

public class Flow_Layout_Demo_1 extends JFrame {
private JButton leftButton, centerButton, rightButton;
private Container container;
private FlowLayout layout;

// set up GUI and register button listeners
public Flow_Layout_Demo_1() {
   super("FlowLayout Demo");

   layout = new FlowLayout();

   // get content pane and set its layout
   container = getContentPane();
   container.setLayout(layout);

   // set up leftButton and register listener
   leftButton = new JButton("Left");

   leftButton.addActionListener(

      // anonymous inner class
      new ActionListener() {

         // process leftButton event  
         public void actionPerformed(ActionEvent event) {
            layout.setAlignment(FlowLayout.LEFT);

            // re-align attached components
            layout.layoutContainer(container);
         }

      }  // end anonymous inner class

   ); // end call to addActionListener

   container.add(leftButton);

   // set up centerButton and register listener
   centerButton = new JButton("Center");

   centerButton.addActionListener(

      // anonymous inner class
      new ActionListener() {

         // process centerButton event  
         public void actionPerformed(ActionEvent event) {
            layout.setAlignment(FlowLayout.CENTER);

            // re-align attached components
            layout.layoutContainer(container);
         }
      }
   );

   container.add(centerButton);

   // set up rightButton and register listener
   rightButton = new JButton("Right");

   rightButton.addActionListener(

      // anonymous inner class
      new ActionListener() {

         // process rightButton event  
         public void actionPerformed(ActionEvent event) {
            layout.setAlignment(FlowLayout.RIGHT);

            // re-align attached components
            layout.layoutContainer(container);
         }
      }
   );

   container.add(rightButton);

   setSize(300, 75);
   setVisible(true);
}

// execute application
public static void main(String args[]) {
   Flow_Layout_Demo_1 application = new Flow_Layout_Demo_1 ();

   application.setDefaultCloseOperation(
      JFrame.EXIT_ON_CLOSE);
}
}  // end class FlowLayoutDemo

