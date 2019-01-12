
//BankAccountTest.java
//BankAccountTest class declaration with montlyProcess method
//and printBalance method

import edu.ac.banklib.BankUtil; // import BankUtil class to be used in printBalance method
import edu.ac.banklib.InitialValues; //import InitialValues class for each account deposit balance

/**
 * This main class is to update monthly BankAccount and print each saving
 * account and chequcing account
 * 
 * @author Xingyi Wu
 */
public class BankAccountTest {

	BankAccount[] user; // instance variable of an array of bankaccount users

	/**
	 * BankAccountTest no-argument constructor Initializes the number of the single
	 * array
	 * 
	 * @param user
	 *            the BankAccount
	 * @see BankAccount#deposit(double) user balance
	 * @see InitialValues#initialDeposit Instantiates the balance of each user
	 *      Instantiates chequing account users and saving account users
	 */

	public BankAccountTest() {

		user = new BankAccount[30]; // Initialize 30 bankaccount users in an array
		for (int i = 0; i < 30; i++) {

			if (i < 15) {
				user[i] = new ChequingAccount(); // Instantiates first 15 users are chequing accounts
			} else {
				user[i] = new SavingsAccount(); // Instantiates the rest are saving account
			} // end of instantiating of account users

			user[i].deposit(InitialValues.initialDeposit[i]); // each user's balance comes from InitialValues class of
																// initialDeposit method

		} // end of Instantiating the balance of each user

	} // end of BankAccountTest constructor

	/**
	 * monthlyProcess method is to update each user's balance passing through each
	 * object via loop
	 * 
	 * @param usr[]
	 *            the user []
	 * @see SavingsAccount#calculateAndUpdateBalance()
	 * @see ChequingAccount#calculateAndUpdateBalance()
	 */

	public void monthlyProcess(BankAccount usr[]) {

		for (int i = 0; i < 30; i++) {

			usr[i].calculateAndUpdateBalance(); // each account user's balance is called from calculateAndUpdateBalance
												// method from respectively class.

		} // end of loop
	} // end of monthlyProcess method

	/**
	 * printBalance method is to print the user's account type, user name and
	 * balance
	 * 
	 * @param bankType
	 *            declares String attribute, initializes the type of user and print
	 *            the name
	 * @see BankUtil#printBalance(String, int, double)
	 */

	public void printBalance() {

		String bankType;

		for (int i = 0; i < 30; i++) {
			if (i < 15) {
				bankType = "Chequcing";
			} else {
				bankType = "Saving";
			}

			BankUtil.printBalance(bankType, i, user[i].getBalance());// call the printBalance method from BankUtil class

			// BankUtil.printBalance(user[i].getClass().getName(), i, user[i].getBalance());

		} // end of loop

	} // end of printBalance method

	/**
	 * main method is to call the mothlyProcess to calculate the balance, and
	 * printBalance method is to print the balance
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		BankAccountTest test = new BankAccountTest(); // create test as new object

		for (int k = 0; k < 12; k++) { // print users balance within 12 months
			test.monthlyProcess(test.user); // call monthlyProcess method
			test.printBalance(); // call printBalance method
		}

	} // end of main method

} // end of BankAccountTest class
