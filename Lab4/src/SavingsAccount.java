
//SavingsAccount.java
//SavingsAccount class declaration with override superclass method.

import edu.ac.banklib.InitialValues; // import InitialValues class to use the method

/**
 * This subclass extends superclass to update the balance of SavingsAccount
 * 
 * @author Xingyi Wu
 */
public class SavingsAccount extends BankAccount {

	private double interesRate; // private instance variable only used in this class

	/**
	 * SavingsAccount no-argument constructor Initialize the instance variable
	 * 
	 * @param interesRate
	 *            the yearly interests rate Obtain the rate from InitialVaules class
	 *            of method interstRate
	 */
	public SavingsAccount() {

		interesRate = InitialValues.interestRate;

	} // end of SavingsAccount constructor

	/**
	 * subclass method override the method of superclass each saving account earns
	 * interests monthly
	 */

	@Override

	public void calculateAndUpdateBalance() {

		balance += interesRate / 12 * balance;

	} // end of calculateAndUpdateBalance method of SavingsAccount class

} // end of SavingsAccount class
