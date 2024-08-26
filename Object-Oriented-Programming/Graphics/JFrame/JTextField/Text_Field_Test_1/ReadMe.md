# Java_21_Text_Field_Test_1

Re: private JTextField textField1, textField2, textField3

Class TextFieldTest is a driver and not an ADT class (i.e.there are no objects of TextFieldTest type.

Therefore the use of private is not needed.  

The use of private has no impact on the execution of this program.

important thing to note:

the code uses a **named action listener**. Specifically, the *TextFieldHandler* class is defined as a **private inner class** within the TextFieldTest class and implements the 
ActionListener interface.

 This named class is then **instantiated and registered** as the action listener for the text fields and password field in the GUI.

