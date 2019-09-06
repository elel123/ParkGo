/* This is the code for the main interface */

import Acme.*;
import objectdraw.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ParkGo extends WindowController {

  Button butt;
  private JTextField textField;
  private JPanel frame;


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

    butt = new Button( Color.blue, 30, 30, 200, 200, this, canvas );
    
    frame = new JPanel(); //This is where the text field will be
    textField = new JTextField(20);
    textField.setBounds( 20, 20, 100, 20 );
    textField.setEditable(true);
    frame.add( textField );
    frame.setSize( 400, 100 );
    this.add( frame, BorderLayout.NORTH );
    this.validate();

	} //end of the begin method


  /**
   * Constructs the appearance of the window
   */
	public ParkGo() {

	} //end of the constructor

  //When buttons have been clicked, this method should be called. 
  public void buttonClicked(/* Insert arguments here */) {
    System.out.println( "Button was clicked" );
  }


} //end of the ParkGo class