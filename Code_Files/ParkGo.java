/* This is the code for the main interface */

import Acme.*;
import objectdraw.*;

public class ParkGo extends WindowController {

  public static void main( String args[] ) {

    //creates the window of size 400x400
    new Acme.MainFrame( new ParkGo(), args, 400, 400 );

	} //end of the main method


  /**
   * First part of code that runs when the window opens 
   *   following the constructor
   */
	public void begin() {

    //Make the window be the main focus when the program starts
    canvas.requestFocusInWindow();

	} //end of the begin method


  /**
   * Constructs the appearance of the window
   */
	public ParkGo() {

	} //end of the constructor

  //When buttons have been clicked, this method should be called. 
  public void buttonClicked(/* Insert arguments here */) {}


} //end of the ParkGo class