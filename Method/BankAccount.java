//Develop a program to create RWO BankAccount in PW
//with the properties bankName, accNum, active

//provide access to above properties only via setter and getter methods to initialize, 
//read and modify its values
//Initialize those properties via setter methods

//Display those properties via display method

//If this account is active, display message
//   account is in Active status
//  else, display message
//   account is in DeActive status


package Method;

public class BankAccount {
	String bankName;
	long	   accNum;
	boolean active;
	
	
	void setBankName(String bankName) {
		this.bankName = bankName ;
	}
	String getBankName() {
		return bankName;
	}
	
	void setAccNum(long accNum) {
		this.accNum = accNum ;
	}
	long getAccNum() {
		return accNum;
	}
	
	void setActive(boolean active) {
		this.active = active ;
	}
	boolean ifActive() {
		return active;
	}
	
	void display() {
		System.out.println(bankName + " " + accNum + " " + active);
	}
}












