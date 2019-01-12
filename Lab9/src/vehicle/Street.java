package vehicle;

import java.awt.FlowLayout; //import flowlayout for GUI functions
import java.awt.event.ActionEvent; //import ActionEvent for GUI button functions
import java.awt.event.ActionListener; //import ActionEvent for GUI button functions
import java.util.ArrayList; // import arraylist
import java.util.Collections; // import collections
import java.util.Comparator; // import comparator 
import java.util.Iterator; // import iterator
import java.util.Random; //import random

import javax.swing.JButton; // import swing JButton
import javax.swing.JFrame; // import swing Jframe
import javax.swing.JTextField; // import swing text field

/**
 * This is VehicleComparator class to implements Comparator<Vehicle> to compare
 * the speed of bicycle and car for sorting
 * 
 * @author Xingyi Wu
 *
 */

class VehicleComparator implements Comparator<Vehicle> {

	public int compare(Vehicle v1, Vehicle v2) // compare instance variable of two objects{
	{
		int speed1 = v1.speed;
		int speed2 = v2.speed;

		if (speed1 == speed2) // when the speed is equal, bicycle comes first
		{
			if (v1 instanceof Bicycle) {
				return -1; // negative int if v1 is before v2
			} else {
				return 1; // positive int if v1 is after v2
			}
		}
		if (speed1 > speed2) {
			return -1;
		} else if (speed1 < speed2) {
			return 1;
		}
		return 0;
	}
} // end of class VehicleComparator

/**
 * This is Street class to implement SimInterface
 * 
 */
public class Street implements SimInterface {

	/**
	 * Instantiate a Random object
	 */
	private static final Random randomNumbers = new Random();
	/**
	 * Instantiate arraylist of Vehicle
	 */
	ArrayList<Vehicle> vehicles;

	/**
	 * Street constructor with no argument to initialize ArrayList
	 */

	public Street() {

		vehicles = new ArrayList<Vehicle>();

	} // end of Street constructor

	/**
	 * named method is used to print vehicle's name and speed, noise and a single
	 * random vehicle has its pedal pushed
	 */
	public void named() {
		/**
		 * initialize variable random is in the range of of ArrayList
		 */
		int random = randomNumbers.nextInt(vehicles.size());

		System.out.println("--- sorted:"); // print a string

		/**
		 * method of collections.sort to sort the ArrayList vehicles
		 */

		Collections.sort(vehicles, new VehicleComparator());

		/**
		 * an iterator is created to go through the Vehicles one by one to print its
		 * name, speed and sound
		 */
		Iterator<Vehicle> iterator = vehicles.iterator();

		while (iterator.hasNext()) // boolean hasNext() is to identify if there is the next element
		{

			Vehicle vehicle = iterator.next(); // iterate the next element of vehicle
			System.out.println(vehicle.name + " speed: " + vehicle.speed + ", " + vehicle.noise()); // print a string

			/*
			 * for (int i = 0; i < vehicles.size(); i++) {
			 * System.out.println(vehicles.get(i).name + ", speed: " +
			 * vehicles.get(i).speed);
			 * 
			 * } for (int i = 0; i < vehicles.size(); i++) {
			 * System.out.println(vehicles.get(i).name + ", noise: " +
			 * vehicles.get(i).noise());
			 * 
			 * }
			 */
		}

		System.out.println("--- shuffled:"); // print a string
		/**
		 * method of collection.shuffle is to randomize the order of the ArrayList
		 * vehicles
		 */
		Collections.shuffle(vehicles);
		/**
		 * restart the iterator to go through the ArrayList one by one to print its
		 * name, speed and sound
		 */
		iterator = vehicles.iterator();

		while (iterator.hasNext()) // boolean hasNext() is to identify if there is the next element
		{

			Vehicle vehicle = iterator.next();// iterate the next element
			System.out.println(vehicle.name + " speed: " + vehicle.speed + ", " + vehicle.noise()); // print a string

		}

		System.out.println("The pedal of " + vehicles.get(random).name + " was pushed"); // print a single random
																							// vehicle has its pedal
																							// pushed

		vehicles.get(random).pedal();

		System.out.println();

	} // end of method named

	/**
	 * simulate method is used to call named method for 6 times
	 */
	public void simulate() {

		for (int i = 0; i < 6; i++) {
			System.out.println("Updated on the street" + i);
			named();
			System.out.println();
		}

	} // end of method simulate

	private JFrame ui = new JFrame("Street Simulation"); // construct an Frame with a title

	private JTextField outputField = new JTextField(40); // construct an TextField with a specified width

	private int count; // instance variable

	/**
	 * method of launch is to support the functions of each button
	 */
	public void launch() {

		JButton a = new JButton("Add Bicycle"); // construct a new button
		/**
		 * call method of addActionListener
		 */
		a.addActionListener(new ActionListener() {
			/**
			 * method of actionPerformed with an argument to perform an event when the
			 * button is clicked.
			 */
			public void actionPerformed(ActionEvent e) {

				vehicles.add(new Bicycle()); // assign an object of Bicycle to the list

				outputField.setText(vehicles.get(count).name + " was added to the Street"); // set an text to the output
																							// field

				count++; // increment of index of vehicles

			}
		});

		JButton b = new JButton("Add Car"); // construct a new button
		/**
		 * call method of addActionListener
		 */
		b.addActionListener(new ActionListener() {
			/**
			 * method of actionPerformed with an argument to perform an event when the
			 * button is clicked.
			 */
			public void actionPerformed(ActionEvent e) {

				vehicles.add(new Car()); // assign an object of Car to the list

				outputField.setText(vehicles.get(count).name + " was added to the Street"); // set text to the output
																							// field

				count++; // increment of index of vehicles

			}
		});

		JButton c = new JButton("Done"); // construct a new button
		/**
		 * call method of addActionListener
		 */
		c.addActionListener(new ActionListener() {
			/**
			 * method of actionPerformed with an argument to perform an event when the
			 * button is clicked.
			 */
			public void actionPerformed(ActionEvent e) {

				if (vehicles.size() > 0) // vehicle is only simulated when there is an vehicle
				{
					simulate();
				} else {
					System.out.println("No vehicles");
				}

			}
		});

		ui.setLayout(new FlowLayout());

		ui.add(a);

		ui.add(b);

		ui.add(c);

		ui.add(outputField);

		ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ui.setSize(600, 150);

		ui.setVisible(true); //
	} // end of launch

	/**
	 * parse - initialize the vehicle array for simulation
	 * 
	 * @param s,
	 *            a String array of either "car" or "bicycle". E.g. {"car",
	 *            "bicycle", "car"}
	 */
	@Override
	public void parse(String[] s) {
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals("car")) {

				vehicles.add(new Car()); // assign a new car to the element
			} else {

				vehicles.add(new Bicycle()); // assign a new bicycle to the element
			}
		}
	} // end of parse

	/**
	 * 
	 * @return - returns the sum of all bicycle speeds
	 */
	@Override
	public int getSumBicyleSpeeds() {
		/**
		 * initialize instance variable
		 */
		int sumbicyclespeed = 0;

		for (int i = 0; i < vehicles.size(); i++) {

			if (vehicles.get(i) instanceof Bicycle) // if the vehicle is a bicycle, sum the speed
			{
				sumbicyclespeed += vehicles.get(i).speed;
			}

		}

		return sumbicyclespeed; // return the sum speed of all bicycles
	} // end of getSumBicyleSpeeds

	/**
	 * @return - returns the sum of all car speeds
	 */
	@Override
	public int getSumCarSpeeds() {
		/**
		 * initialize instance variable
		 */
		int sumcarspeed = 0;

		for (Vehicle v : vehicles) {

			if (v instanceof Car) // if the vehicle is a car, sum the speed
			{
				sumcarspeed += v.speed;
			}

		}

		return sumcarspeed; // return the sum speed of all cars
	} // end of getSumCarSpeeds

	/**
	 * main method is to call the simulate method of Street class
	 * 
	 * @param args
	 *            - to pass String array to main method
	 */
	public static void main(String[] args) {
		Street thestreet = new Street();
		thestreet.launch();

	} // end of main

} // end of class Street
