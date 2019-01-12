package vehicle;

import static org.junit.Assert.assertTrue; // import junit of assert methods

import org.junit.Test; // import junit test method

/**
 * this is SimulationTest class to perform unit tests
 * 
 * @author Xingyi Wu
 *
 */
public class SimulationTest {

	/**
	 * test method is to test the function of Street class
	 */
	@Test
	public void test() {
		/**
		 * instantiate the street object
		 */
		Street Street = new Street();
		/**
		 * create a new string array
		 */
		String[] s = { "car", "car", "car", "biycle", "bicycle" };
		/**
		 * pass a String array of either "car" or "bicycle"
		 */
		Street.parse(s);
		/**
		 * invoke simulate function of the street object
		 */
		Street.simulate();
		/**
		 * obtain the total of car speeds
		 */
		int bicyclespeed = Street.getSumBicyleSpeeds() / 4;
		/**
		 * obtain the total of bicycle speeds
		 */
		int carspeed = Street.getSumCarSpeeds() / 10;
		/**
		 * if the addition of speeds is 6.
		 */
		assertTrue((bicyclespeed + carspeed) == 6);
	}// end of test
} // end of class
