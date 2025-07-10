//Develop BankAccount application by encapsulating balance variable
//also develop validation to stop storing -ve values and zero


package Encapsulation;

public class BankAccount {
	private double balance;
	
	
	public void setBalance(double balance) throws IllegalArgumentException {
		if(balance <= 0) {
			throw new IllegalArgumentException("Don't pass -ve value.");
		}
		this.balance=balance;
	}
	
	public double getBalance() {
		return balance;
	}
}
