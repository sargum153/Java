package Encapsulation;


import java.util.Scanner;
import java.util.InputMismatchException;
public class VoterRegOffice {
	 public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
		 
		 while(true) {
			 Voter v = new Voter();
			 System.out.print("Enter name :");
			 v.setName(scn.nextLine());
			 
			 try {
				 System.out.print("Enter age :");
				 v.setAge(scn.nextInt());
				 System.out.println("Hi " + v.getName() + " Your name Saved.");
				 System.out.println("Please Collect your voter card.");
				 System.out.println("From eseva kendra after 30 days.");
				 
			 } catch (InputMismatchException e) {
				 System.out.println("Pass a integer number.");
				 scn.nextLine();
			 } catch (IllegalArgumentException e) {
				 System.out.println(e.getMessage());
			 }
		 }
	 }
}
