package jFrame;

import java.awt.*;

import java.awt.event.*;
// Java extension packages
import javax.swing.*;

public class ShowColors extends JFrame {

	  public static void main( String args[] )   {
	      ShowColors application = new ShowColors();
	      application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE ); 
	  }


	  // constructor sets window's title bar string and dimensions
	  public ShowColors()   {
	    super( "4 RGB colors" ); // will put a title on the frame bar
	    setSize( 800, 260 );     // size in pixels
	    show();
	  }
	   public void paint( Graphics g )   {
	  
	      // Graphics class paint() method is automatically called
	      super.paint( g );
	      // setColor, fillRect, drawstring, getColor, getRed etc 
	      // are methods of Graphics class     
	      // set new drawing color using integers for R/G/B
	      g.setColor( new Color( 255, 0, 0 ) ); 
	      g.fillRect( 25 , 50 , 100 , 20 );
	      g.drawString( "Current RGB: " + g.getColor(), 130, 65 );
	      
	      // set new drawing color using floats
	      g.setColor( new Color( 0.0f, 1.0f, 0.0f ) );
	      g.fillRect( 25, 75, 100, 20 );
	      g.drawString( "Current RGB: " + g.getColor(), 130, 90 );
	    // set new drawing color using static Color objects
	      g.setColor( Color.blue );
	      g.fillRect( 25, 100, 100, 20 );
	      g.drawString( "Current RGB: " + g.getColor(), 130, 115 );
	      
	      // display individual RGB values
	      Color color = Color.magenta;
	      g.setColor( color );
	      g.fillRect( 25, 125, 100, 20 );
	      g.drawString( "RGB values: " + color.getRed() + ", " +
	         color.getGreen() + ", " + color.getBlue(), 130, 140 );
	   }  
	}  // end class ShowColors 


