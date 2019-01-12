package guitar;

import edu.ac.guitarlib.Board; //import board from guitarlib

/**
 * This class is GuitarFrame to support singleton pattern
 * 
 * @author Xingyi Wu CST8132
 * @see java.lang.Object
 */
public class GuitarFrame {

	Board board; // instantiate the single Board object

	private static GuitarFrame guitarframe; // instantiate the guitarframe object

	/**
	 * GuitarFrame non-argument constructor Initializes instance variable
	 * 
	 * @param board
	 *            - the object is to Initializes instance variable
	 */
	private GuitarFrame() {
		board = new Board();
	} // end of GuitarFrame constructor

	/**
	 * Method of getInstance is to return the singleton guitarframe
	 * 
	 * @return guitarframe - is the returned instance of this class
	 */
	public static GuitarFrame getInstance() {
		if (guitarframe == null) {
			guitarframe = new GuitarFrame();
		}
		return guitarframe;

	} // end of getInstance method

	/**
	 * Method of get board
	 * 
	 * @return board - is the returned instance of Board class
	 */
	public Board getBoard() {
		return board;
	} // end of getBoard method

} // end of GuitarFrame class
