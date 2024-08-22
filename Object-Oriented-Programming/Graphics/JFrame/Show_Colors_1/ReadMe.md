# Java_21_JFrame_Show_Colors_1

### Some general notations:

Graphics applications typically employ many classes.

Many of these classes are part of the Abstract Windows Tools (*AWT*)

To see the wealth of classes available in Java use the website: **http://docs.oracle.com/javase/7/docs/api**

### Comments about the JFrame example:

The JFrame application *ShowColors* is a driver type class.

In the class *ShowColors*, presented in the previous 2 slides, we saw the following methods/constructor:

1 - ***main()***, which is the regular driver method for any application on your computer.
In this case its main job is to create a ShowColors object with the reference “application”. 
This will call the constructor with no parameters.
A secondary job is to provide the feature “X” on the top right corner of the frame created, which if clicked will close the frame.


2 - The constructor ***ShowColors()*** contains 3 calls to JFrame methods: *super()*, passes to the JFrame constructor a text which will appear on the frame title bar, *setSize()* gives 
the width and the height of the frame, and *show()*.


3 - The Graphics method *paint()* is overwritten in class *ShowColors*.
 Class Graphics is above class JFrame in the inheritance tree of Java Development Kit. 


4 - The Graphics methods drawString() and fillRect() use x,y coordinates. 

