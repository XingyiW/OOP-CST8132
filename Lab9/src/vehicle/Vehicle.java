package vehicle;

/**
 * This is Vehicle class, which is a super class in abstract
 * 
 * @author Xingyi Wu
 *
 */
public abstract class Vehicle {

	/**
	 * Instantiate variables of vehicle name in String in protected type
	 */
	protected String name;
	/**
	 * Instantiate variables of vehicle speed in integer in protected type
	 */
	protected int speed;
	/**
	 * Instantiate variables of vehicle wheel in integer in protected type
	 */
	protected int wheels;
	/**
	 * Instantiate variables of vehicle index in integer in protected type
	 */
	static int num;

	/**
	 * Abstract method of String noise with no body is to return the noise of each
	 * vehicle and will be used in subclass
	 * 
	 * @return - each vehicle noise
	 */
	public abstract String noise();
	// end of method Sting noise

	/**
	 * Abstract method of pedal with no body is to speed up and will be used in
	 * subclass
	 */
	public abstract void pedal();
	// end of method pedal

} // end of class Vehicle
