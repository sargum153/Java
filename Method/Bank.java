package Method;

public class Bank {
	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount();
		
		System.out.println("acc1 object is created");
		
		acc1.display();
	
		if(acc1.ifActive()) {
			System.out.println("acc1 is active");
			
		} else {
			System.out.println("acc1 is not active");
		}
		
		System.out.println();
		
	// initialized acc1 value 
		acc1.setBankName("HDFC");
		acc1.setAccNum(12344322121L);
		acc1.setActive(false);
		
		acc1.display();
		
		System.out.println(acc1.ifActive() ? "acc1 is active." : "acc1 is not active.");
	}
}
