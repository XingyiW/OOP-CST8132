
//BankAccount.java
//BankAccount class declaration with abstract method calculateAndUpdateBalance, deposit and getBalance
import edu.ac.banklib.BankInterface; //import BankInterface class from banklib to be implemented

/**
 * this class is super class and abstract class to maintain the balance of bank
 * accounts implements BankInterface class
 * 
 * @author Xingyi Wu
 * @see java.lang.Object
 */
public abstract class BankAccount implements BankInterface {

	double balance; // instance variable

	/**
	 * calculateAndUpdateBalance is abstract method, to be invoked by subclass objects 
	 * , and there is no body in abstract method
	 */

	@Override

	public abstract void calculateAndUpdateBalance();

	/**
	 * deposit method to add balance of bank accounts
	 * 
	 * @param addmoney
	 *            the increment of balance when account is deposited and/or month
	 *            interests rates is added
	 * @return
	 */

	@Override
	public void deposit(double addmoney) {

		balance += addmoney;

	} // end method deposit

	/**
	 * Gets the balance
	 * 
	 * @return a <code>double</code> specifying the balance of different types of
	 *         bank accounts
	 */

	@Override
	public double getBalance() {

		return balance;
	} // end method getBalance

} // end of BankAccount class
