package guitar;

import edu.ac.guitarlib.Board; //import board from guitarlib

/**
 * This class is Wire to support the tune on the board by pushing fret and
 * plucked.
 * 
 * @author Xingyi Wu
 * 
 */
public class Wire {

	public int tension; // instance variable
	public int fretNum; // instance variable
	public Board board; // instantiate the board object

	/**
	 * Wire constructor with argument Initializes instance variable
	 * 
	 * @param tension
	 *            - is the Initializes instance variable
	 */
	public Wire(int tension) {

		this.tension = tension;
		this.board = GuitarFrame.getInstance().getBoard();
		fretNum = 0;

	} // end of constructor

	/**
	 * Method of setBoard to call the Board class
	 * 
	 * @param board
	 *            - is the variable to pass the setBoard method
	 */

	public void setBoard(Board board) {
		this.setBoard(board);
	} // end of setBoard method

	/**
	 * Method of fret to represent the fretNum
	 * 
	 * @param fretNum
	 *            - is the variable to pass the fret method
	 */

	public void fret(int fretNum) {

		if (fretNum >= 0) {
			this.fretNum = fretNum;
		}
	} // end of fret method

	/**
	 * Method of pluck is to invoke the the singleton Board's soundNote method
	 */

	public void pluck() {
		System.out.println(tension);
		// this.board.soundNote(tension+fretNum);
		board.soundNote(tension + fretNum); // sounds is different when fret is held
											// against,so the parameter passed to the
											// method soundNote via the singleton board
											// is tension+fretNum
	} // end of pluck

	// private void vibrate() {
	// this.board.soundNote(tension);
	// }
	/**
	 * Method of changeTension is to alter the tune
	 * 
	 * @param deltaTension
	 *            - is the variable to pass the changeTension
	 */

	public void changeTension(int deltaTension) {

		if (deltaTension == 0) {
			tension = 0;
		}

		tension += deltaTension;
	} // end of changeTension method

} // end of Wire class
