package vehicle;

import java.util.Random; // import Random package

/**
 * This is Street class to simulate the vehicles.
 * 
 */
public class Street {

	/**
	 * Instantiate a Random object
	 */
	private static final Random randomNumbers = new Random();
	/**
	 * Instantiate Vehicle object in array
	 */
	private Vehicle[] vehicles;

	/**
	 * Street constructor with no argument to initialize variable new vehicle in
	 * array and for loop is used to initialize index of cars and bicycles via odd
	 * and even number
	 */

	public Street() {

		vehicles = new Vehicle[4];

		/*
		 * vehicles[0] = new Car(); vehicles[2] = new Car(); vehicles[1] = new
		 * Bicycle(); vehicles[3] = new Bicycle();
		 */

		for (int i = 0; i < vehicles.length; i++) {

			if (i % 2 == 0) {

				vehicles[i] = new Car();
			} else {

				vehicles[i] = new Bicycle();
			}
		}

	} // end of Street constructor

	/**
	 * named method is used to print vehicle's name and speed, noise and a single
	 * random vehicle has its pedal pushed
	 */
	public void named() {

		int random = randomNumbers.nextInt(4);

		for (int i = 0; i < vehicles.length; i++) {
			System.out.println(vehicles[i].name + ", speed: " + vehicles[i].speed);
		}

		for (int i = 0; i < vehicles.length; i++) {
			System.out.println(vehicles[i].name + ", noise: " + vehicles[i].noise());

		}

		System.out.println("Pedal of " + vehicles[random].name + " was pushed");

		vehicles[random].pedal();

		System.out.println();

	} // end of method named

	/**
	 * simulate method is used to call named method for 6 times
	 */
	public void simulate() {

		for (int i = 0; i < 6; i++) {
			named();
			System.out.println();
		}

	} // end of method simulate

	/**
	 * main method is to call the simulate method of Street class
	 * 
	 * @param args
	 *            - to pass String array to main method
	 */
	public static void main(String[] args) {
		Street thestreet = new Street();
		thestreet.simulate();
	} // end of main

} // end of class Street
