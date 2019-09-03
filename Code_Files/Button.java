/* This is the class that sets up an outline for the buttons used in the App */

import objectdraw.*;
import java.awt.Point;
import java.awt.event.*;
import java.awt.Color;

public class Button implements MouseListener {

  //Information to be saved upon the creation of this object
  private Color color;
  private int height;
  private int width;
  private int buttonX;
  private int buttonY;
  private ParkGo pageRef;
  private DrawingCanvas canvas;

  //Instance variables
  private FilledRect button; //Refer to the eventfuljava documentation on methods to this class
  private boolean isHidden = false; //Button isn't hidden when it is first made.

  /**
   * Constructor for the button
   *
   * 
   */
  public Button( Color c, int h, int w, int x, int y, int ref, DrawingCanvas can ) {
    
    //Saving all the formal parameters into instance variables. 
    color = c;
    height = h;
    width = w;
    buttonX = x;
    buttonY = y;
    pageRef = ref; /* This allows us to send feedback to the page that 
                    *   contains the button. (ie. when clicked)
                    */
    canvas = can; //This is the reference to the canvas (the page) on which we draw on 

    button = new FilledRect( buttonX, buttonY, width, height, canvas );
    button.setColor( color );

  } //end of the Button constructor

  /* These are all the inherited methods from the MouseListener interface 
   *   some are used and some might not be used 
   *   "evt" is how we handle our mouse-click events */
  public void mouseClicked( MouseEvent evt ) { /* CODE GOES IN HERE (or not) */ }

  public void mouseEntered( MouseEvent evt ) { /* CODE GOES IN HERE (or not) */ }

  public void mouseExited( MouseEvent evt ) { /* CODE GOES IN HERE (or not) */ }

  public void mousePressed( MouseEvent evt ) { 
    
    Point pointClicked = evt.getLocationOnScreen();
    Location locClicked = new Location( pointClicked ); //convert to location

    if (!isHidden && button.contains( locClicked )) {
      //Makes the button lighter if pressed (temporarily)
      int newRed = color.getRed() + (255 - color.getRed()) * 1/2;
      int newGreen = color.getGreen() + (255 - color.getGreen()) * 1/2;
      int newBlue = color.getBlue() + (255 - color.getBlue()) * 1/2;
      button.setColor( newRed, newGreen, newBlue );
    }
  }

  public void mouseReleased( MouseEvent evt ) {
    button.setColor( color ); //reset button to original color
    pageRef.buttonClicked(); //Signal to the page that the button is clicked
  }


  public void hide() {
    isHidden = true;
    button.hide();
  }

  public void show() {
    isHidden = false;
    button.show();
  }


} //end of the Button class
