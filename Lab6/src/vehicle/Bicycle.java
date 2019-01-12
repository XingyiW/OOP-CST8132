package vehicle;

/**
 * This is class Bicycle, which is subclass from Vehicle
 * 
 * @author Xingyi Wu
 *
 */
public class Bicycle extends Vehicle {
	/**
	 * Bicycle constructor with no argument is to initialize the variables
	 */
	public Bicycle() {

		name = "bicycle" + num++;
		speed = 0;
		wheels = 4;

	} // end of constructor

	/**
	 * Method of String noise overrides the superclass method to return String noise
	 * 
	 * @return - return String noise
	 */
	@Override
	public String noise() {
		if (speed == 0) {
			return "sigh";
		}
		return "grunt";
	} // end of method String noise

	/**
	 * Method of pedal overrides the superclass method to speed up
	 */
	@Override
	public void pedal() {
		if (speed < 40) {
			speed += 4;
		}
	} // end of method pedal

} // end of class
