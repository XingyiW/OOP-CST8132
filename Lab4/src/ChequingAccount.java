
//ChequingAccount.java
//ChequingAccount class declaration with calculateAndUpdateBalance method.

import edu.ac.banklib.InitialValues; // import InitialValues class to use the method

/**
 * This subclass extends from superclass BankAccount update ChequingAccount
 * balance
 * 
 * @author Xingyi Wu
 */
public class ChequingAccount extends BankAccount {

	private double fee; // private instance variable only used in this class

	/**
	 * ChequingAccount no-argument constructor Initializes instance variable
	 * 
	 * @param fee
	 *            the monthly fee obtain numbers from InitialVaues class of method
	 *            feePerMonth
	 */

	public ChequingAccount() {

		fee = InitialValues.feePerMonth;
	} // end of ChequingAccount constructor

	/**
	 * subclass method calculateAndUpdateBalance overrides the superclass method
	 * charge the monthly fee for each chequing account
	 */
	@Override

	public void calculateAndUpdateBalance() {
		balance -= fee;
	} // end of calculateAndUpdateBalance method of ChequingAccount class

} // end of ChequingAccount class
