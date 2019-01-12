package vehicle;

import static org.junit.Assert.assertEquals; // import junit assert to test methods of vehicle
import static org.junit.Assert.assertTrue; // import junit assert to test methods of vehicle

import org.junit.Test; // import junit test package

/**
 * This is class BicycleTest to test the behavior of Bicycle
 * 
 * @author Xingyi Wu
 *
 */
public class BicycleTest {
	/**
	 * Instantiate a new object of Bicycle
	 */
	Bicycle bicycle = new Bicycle();

	/**
	 * Method of testspeed is to verify the speed is 0
	 */
	@Test
	public void testspeed() {

		assertTrue(bicycle.speed == 0);

	} // end of method testspeed

	/**
	 * Method of testsound is to verify the sound is "sigh"
	 */
	@Test
	public void testsound() {
		assertTrue(bicycle.noise().equals("sigh"));
	} // end of method testsound

	/**
	 * Method of testpedal is to push the pedal
	 */
	@Test
	public void testpedal() {
		assertTrue(bicycle.speed == 0);
	} // end of method testpedal

	/**
	 * Method of verifyspeed is to verify the speed is 4
	 */
	@Test
	public void verifyspeed() {
		bicycle.pedal();
		assertEquals(4, bicycle.speed);

	} // end of method verifyspeed

	/**
	 * Method of verifysound is to verify the sound is "grunt"
	 */
	@Test
	public void verifysound() {
		bicycle.pedal();
		assertEquals("grunt", bicycle.noise());
	} // end of method verifysound

} // end of class
