package test_field_test;

//TextFieldTest.java
//Demonstrating the JTextField class.

//Java core packages
import java.awt.*;
import java.awt.event.*;

//Java extension packages
import javax.swing.*;

public class TextFieldTest extends JFrame {
 private JTextField textField1, textField2, textField3;
 private JPasswordField passwordField;

 // set up GUI
 public TextFieldTest() {
     super("Testing JTextField and JPasswordField");

     Container container = getContentPane();
     container.setLayout(new FlowLayout());

     // construct textfield with default sizing
     textField1 = new JTextField(10);
     container.add(textField1);

     // construct textfield with default text
     textField2 = new JTextField("Enter text here");
     container.add(textField2);

     // construct textfield with default text and
     // 20 visible elements and no event handler
     textField3 = new JTextField("Uneditable text field", 20);
     textField3.setEditable(false);
     container.add(textField3);

     // construct textfield with default text
     passwordField = new JPasswordField("Hidden text");
     container.add(passwordField);

     // register event handlers
     TextFieldHandler handler = new TextFieldHandler();
     textField1.addActionListener(handler);
     textField2.addActionListener(handler);
     textField3.addActionListener(handler);
     passwordField.addActionListener(handler);

     setSize(325, 100);
     setVisible(true);
 }

 // execute application
 public static void main(String args[]) {
     TextFieldTest application = new TextFieldTest();
     application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }

 // private inner class for event handling
 private class TextFieldHandler implements ActionListener {

     // process text field events
     public void actionPerformed(ActionEvent event) {
         String string = "";

         // user pressed Enter in JTextField textField1
         if (event.getSource() == textField1)
             string = "textField1: " + event.getActionCommand();

         // user pressed Enter in JTextField textField2
         else if (event.getSource() == textField2)
             string = "textField2: " + event.getActionCommand();

         // user pressed Enter in JTextField textField3
         else if (event.getSource() == textField3)
             string = "textField3: " + event.getActionCommand();

         // user pressed Enter in JTextField passwordField
         else if (event.getSource() == passwordField) {
             JPasswordField pwd = (JPasswordField) event.getSource();
             string = "passwordField: " + new String(passwordField.getPassword());
         }

         JOptionPane.showMessageDialog(null, string);
     }

 }  // end private inner class TextFieldHandler

}  // end class TextFieldTest
