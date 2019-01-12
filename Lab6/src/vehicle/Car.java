package vehicle;

/**
 * This is class Car, which is a subclass from Vehicle
 * 
 * @author Xingyi Wu
 *
 */
public class Car extends Vehicle {
	/**
	 * Car constructor with no argument is to initialize variables
	 */
	public Car() {

		name = "car" + num++;
		speed = 0;
		wheels = 2;

	} // end of constructor

	/**
	 * Method of String noise overrides the superclass method to return String noise
	 * 
	 * @return - return String noise
	 */
	@Override
	public String noise() {
		if (speed == 0) {
			return "purr";
		} else {
			return "vroom";
		}

	} // end of method String noise

	/**
	 * Method of pedal overrides the superclass method to speed up
	 */
	@Override
	public void pedal() {
		speed += 10;
	} // end of method pedal
} // end of class
