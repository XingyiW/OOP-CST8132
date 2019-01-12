public class Test {

	// method 1

	/*
	 * public static String lessThan100(int number) throws Exception {
	 * 
	 * if (number >= 100) throw new Exception("Number	too	large.");
	 * 
	 * return String.format("The	number	%d	is	less	than	100", number); }
	 * 
	 * public static void main(String args[]) { try {
	 * System.out.println(lessThan100(1)); System.out.println(lessThan100(22));
	 * System.out.println(lessThan100(100)); System.out.println(lessThan100(11)); }
	 * catch (Exception exception) { System.out.println(exception.toString()); } }
	 */
	// end main method

	/*
	 * The number 1 is less than 100 The number 22 is less than 100
	 * java.lang.Exception: Number too large.
	 */

	// No.2

	/*
	 * public static void method3() throws RuntimeException { throw new
	 * RuntimeException("RuntimeException	occurred	in	method3"); }
	 * 
	 * public static void method2() throws RuntimeException { try { method3(); }
	 * catch (RuntimeException exception) { System.out.
	 * printf("The	following	exception	occurred	in	method2\n%s\n",
	 * exception.toString()); throw exception; } } // end method2
	 * 
	 * public static void method1() throws RuntimeException { try { method2(); }
	 * catch (RuntimeException exception) { System.out.
	 * printf("The	following	exception	occurred	in	method1\n%s\n",
	 * exception.toString()); throw exception; } } // end method1
	 * 
	 * public static void main(String args[]) { try { method1(); } catch
	 * (RuntimeException exception) {
	 * System.out.printf("The	following	exception	occurred	in	main\n%s\n",
	 * exception.toString()); } } // end main
	 */
	/*
	 * The following exception occurred in method2 java.lang.RuntimeException:
	 * RuntimeException occurred in method3 The following exception occurred in
	 * method1 java.lang.RuntimeException: RuntimeException occurred in method3 The
	 * following exception occurred in main java.lang.RuntimeException:
	 * RuntimeException occurred in method3
	 */

	// No.3
	/*
	 * public static String divide(int number1, int number2) { return
	 * String.format("%d	divided	by	%d	is	%d", number1, number2, (number1 /
	 * number2)); }
	 * 
	 * public static void main(String args[]) { try { System.out.println(divide(4,
	 * 2)); System.out.println(divide(20, 5)); System.out.println(divide(100, 0)); }
	 * catch (Exception exception) { System.out.println(exception.toString()); } }
	 * // end main
	 */

	/*
	 * 4 divided by 2 is 2 20 divided by 5 is 4 java.lang.ArithmeticException: / by
	 * zero
	 */

	// No.4
	/*
	 * public static String sum(int num1, int num2) { return
	 * String.format("%d	+	%d	=	%d", num1, num2, (num1 + num2)); }
	 * 
	 * public static void main(String args[]) { int number1; int number2;
	 * 
	 * try { number1 =
	 * Integer.parseInt(JOptionPane.showInputDialog("Enter	an	integer:	"));
	 * 
	 * number2 =
	 * Integer.parseInt(JOptionPane.showInputDialog("Enter	another	integer:	"));
	 * 
	 * System.out.println(sum(number1, number2)); } catch (NumberFormatException
	 * numberFormatException) {
	 * System.out.println(numberFormatException.toString()); } } // end main method
	 */

}
