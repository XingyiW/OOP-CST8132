package guitar;

import edu.ac.guitarlib.LeftSideOfGuitar; // import LeftSideOfGuitar from guitarlib
import edu.ac.guitarlib.Midi; // import Midi from guitarlib
import edu.ac.guitarlib.RightSideOfGuitar; // import RightSideOfGuitar from guitarlib

/**
 * This class is Guitar class, which implements LeftSideOfGuitar and
 * RightSideOfGuitar
 * 
 * @author Xingyi Wu
 * 
 */
public class Guitar implements LeftSideOfGuitar, RightSideOfGuitar {
	/**
	 * instantiate Wire object in array
	 */
	public Wire[] wires;
	/**
	 * instantiate Peg object in array
	 */
	public Peg[] pegs;

	/**
	 * Guitar non-argument constructor Initializes instance variable of the array
	 */
	public Guitar() {

		wires = new Wire[6]; // Initializes 6 wires
		pegs = new Peg[6]; // Initializes 6 pegs

		for (int i = 0; i < wires.length; i++) {
			wires[i] = new Wire(Midi.GUITAR_TABLE[i]); // each wire is called for the method of Guitar_table in Midi
														// class.
			pegs[i] = new Peg(wires[i]); // each peg is related
			// p[i].turn(Midi.GUITAR_TABLE[i]);

		}

	} // end of Guitar constructor

	/**
	 * Method of fret is to fret of wires
	 * 
	 * @param wireNum
	 *            - is the variable of wire object to pass fret method
	 * @param fretNum
	 *            - is the variable of fret object to pass fret method
	 */
	public void fret(int wireNum, int fretNum) {
		wires[wireNum - 1].fret(fretNum);
	} // end of fret method

	/**
	 * Method of hammeron is to fret the Wire at the freNum and pluck it at the same
	 * time
	 * 
	 * @param wireNum
	 *            - is the variable of wire object to pass fret and pluck method
	 * @param fretNum
	 *            - is the variable of fret object to pass fret method
	 */
	public void hammerOn(int wireNum, int fretNum) {
		wires[wireNum - 1].fret(fretNum);
		wires[wireNum - 1].pluck();
	} // end of hammerOn method

	/**
	 * Method of pluck is to pluck each Wire
	 * 
	 * @param wireNum
	 *            - is the variable of wire object to pass pluck method
	 */

	public void pluck(int wireNum) {
		wires[wireNum - 1].pluck();

		// System.out.println("Wirenum - " + wireNum);
	} // end of pluck method

	/**
	 * Method of turn is to turn peg by deltaTension
	 * 
	 * @param pegNum
	 *            - is the variable of peg object to pass the turn method
	 * @param deltaTension
	 *            - is the variable to pass turn method
	 */
	public void turn(int pegNum, int deltaTension) {
		pegs[pegNum - 1].turn(deltaTension); // turn(pegNum, tension);
	} // end of turn method

} // end of Guitar class
