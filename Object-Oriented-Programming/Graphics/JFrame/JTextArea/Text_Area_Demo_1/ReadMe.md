# Java_21_Text_Area_Demo_1

The program shown illustrates the way in which you should create and use JTextArea objects.

## Note: Three ways to code action

Have the JFrame application implementing ActionListener, like in the class Sum.

This implies that actionPerformed() is a regular method in that class. This is certainly the 
shortest/best code !!

Use an inner classes with actionPerformed()

Use a no-name inner class with actionPerformed()

In your tests and assignments you are allowed to use any of the 3 alternatives, but I would prefer the first alternative.

Thus, for the sake of ActionListening for the *copy* button, we could have used the no-name inner class instead of implementnig the ActionListener class for JFrame:

 copy.addActionListener( 
               new ActionListener() { 
                   public void actionPerformed( ActionEvent e ){
                        t2.setText( t1.getSelectedText() ); 
                   }     }    ); 

