package guitar;

/**
 * This class is Peg to support tunes when wire is altered.
 * 
 * @author Xingyi Wu
 *
 */
public class Peg {

	public Wire wires; // Instantiate the object of Wire

	/**
	 * Peg constructor with argument to Initializes instance variable
	 * 
	 * @param wires
	 *            - the object wires is to Initializes instance variable
	 */
	public Peg(Wire wires) {
		this.wires = wires;

	} // end of Peg constructor

	/**
	 * Method of turn is to alter the wires by calling the method of changeTension
	 * of Wire class
	 * 
	 * @param deltaTension
	 *            - is the variable to pass changeTension.
	 */
	public void turn(int deltaTension) {
		wires.changeTension(deltaTension);
	} // end of turn method

} // end of Peg class