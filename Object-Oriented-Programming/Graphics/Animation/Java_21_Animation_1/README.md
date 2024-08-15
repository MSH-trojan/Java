# Java_21_Animation_1

This JFrame application is the programming behind many computer games.

In this application a red circle is moving (non-stop) between the top-left point (10,30) and the middle of the frame (100,130) (i.e. in both directions)

This program one creates a thread in which the position of the red circle is recalculated and the method repaint() is used to replace the old circle with the new one.

Each circle is displayed for 50 milliseconds.

Class Anim.java can be changed to have the red circle moving from the top right corner of the frame to the middle of the frame.

The code is the class Anim1.java which inside method paint() has:
g.fillOval(getWidth()-20-position, 20+position, 30, 30);

The top right corner has the coordinates:
(getWidth()-20, 20) 

and x is decreased, while y is increased.

