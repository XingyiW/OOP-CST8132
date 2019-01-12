package vehicle;

import static org.junit.Assert.assertEquals; // import junit assert to test methods of vehicle
import static org.junit.Assert.assertTrue; // import junit assert to test methods of vehicle

import org.junit.Test; // import junit Test package

/**
 * This is class CarTest to test the behavior of Car
 * 
 * @author Xingyi Wu
 *
 */
public class CarTest {
	/**
	 * Instantiate a new object of Car
	 */
	Car car = new Car();

	/**
	 * Method of testspeed is to verify the speed is 0
	 */
	@Test
	public void testspeed() {

		assertTrue(car.speed == 0);
	} // end of method testspeed

	/**
	 * Method of testsound is to verify the sound is "purr"
	 */
	@Test
	public void testnoise() {
		assertTrue(car.noise() == "purr");
		// assertTrue(car.noise().equals("purr"));
	} // end of method testnoise

	/**
	 * Method of testpedal is to push the pedal
	 */
	@Test
	public void testpedal() {
		car.pedal();
		assertTrue(car.speed == 10);
	} // end of method testpedal

	/**
	 * Method of verifyspeed is to verify the speed is 10
	 */
	@Test
	public void verifyspeed() {
		car.pedal();
		assertEquals(10, car.speed);
		/*
		 * car.pedal(); assertEquals(10, car.speed);
		 */
		/*
		 * car.pedal(); assertEquals(20, car.speed);
		 */
	} // end of method verifyspeed

	/**
	 * Method of verifysound is to verify the sound is "vroom"
	 */
	@Test
	public void verifysound() {
		car.pedal();
		assertEquals("vroom", car.noise());
	} // end of method verifysound

} // end of class
