# Notes to be aware of:

 a Frame application called Test in which we test various ways to program JLabel, JTextfield, JPasswordField and JButton objects.

The action in the textfields is based on the private class TextFieldHandler

The action of the button is using a no-name event listener. 

In this Test the method actionPerformed() is using the class JOptionPane for display.

## On the use of No-name Class

In the previous example the action of the textfields  was processed by the object handler of the private (or inner) class TextFieldHandler,

while the button action was processed by a no-name object of the no-name private class.

The method addActionListener() used in the button case should have in the brackets the processor object.  

As the no-name object is of a no-name class which implements the interface ActionListener, Java allows for the identification of that object with new ActionListener(). 

This shortcut is confusing and you can avoid it if you want. 

You can put the button processing inside the actionPerformed() of the textfields.


