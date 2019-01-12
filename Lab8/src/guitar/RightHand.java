package guitar;

import edu.ac.guitarlib.GuitarPlayerRightHand; //import GuitarPlayerRightHand from guitarlib

/**
 * This class is RightHand to implement GuitarPlayerRightHand
 * 
 * @author Xingyi Wu
 * 
 */
public class RightHand implements GuitarPlayerRightHand {

	Guitar guitar; // Instantiate the Guitar object

	/**
	 * RightHand constructor with argument to Initialize the variable
	 * 
	 * @param guitar
	 *            is to Initialize the variable
	 */
	public RightHand(Guitar guitar) {

		this.guitar = guitar;

	} // end of RightHand constructor

	/**
	 * Method of pluck is to pluck the string one by one
	 * 
	 * @param strings
	 *            - is the variable to pass pluck
	 */
	@Override
	public void pluck(int... strings) {

		for (int i = 0; i < strings.length; i++) {
			guitar.pluck(strings[i]);
		}

	} // end of pluck method

	/**
	 * Method of strum is to pluck all strings from string6 to string1 pausing 80
	 * milliseconds between plucks
	 */
	@Override
	public void strum() {

		for (int i = 6; i > 0; i--) {
			guitar.pluck(i);
			pause(80);
		}
	} // end of strum method

	/**
	 * Method of strum is to pluck all strings from stringNum to string1 pausing 80
	 * milliseconds between plucks
	 * 
	 * @param stringNum
	 *            is the variable to pass strum
	 */
	@Override
	public void strum(int stringNum) {

		for (int i = stringNum; i > 0; i--) {
			guitar.pluck(i);
			pause(80);

		}
	} // end of strum method

	/**
	 * Method of pause is to pause milliSeconds milliseconds
	 * 
	 * @param milliSeconds
	 *            - is the variable to pass pause and sleep
	 */
	@Override
	public void pause(int milliSeconds) {

		try {
			Thread.sleep(milliSeconds);
		} catch (Exception e) {
		}

	} // end of pause method

} // end of RightHand class
