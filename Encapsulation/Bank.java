package Encapsulation;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Bank {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		BankAccount b1 = new BankAccount();
		
		while(true) {
			try {
				System.out.println("Please enter your Amount: ");
				b1.setBalance(scn.nextDouble());
				
				System.out.println("Current balance : " + b1.getBalance());
			
			} catch(InputMismatchException e) {
				System.out.println("Enter only Integer number.");
				scn.nextLine();
				
			} catch(IllegalArgumentException e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
	}
}
