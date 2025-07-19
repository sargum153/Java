package DataStructuresAndAlgorithms;

import java.util.Scanner;
public class GcdOfTwoNum {
	
	public static void main(String[] args) {
		int number1, number2;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter 1st number : ");
		number1 = scn.nextInt();
		
		System.out.println("Enter 2nd number : "
				+ "");
		number2 = scn.nextInt();
		
		int gcd = 1;
		for(int i = 1; i<=number1 && i<=number2; i++) {
			if(number1 % i == 0 && number2 % i == 0) {
				gcd = i;
			}
			
			
		}
		System.out.println(" GCD = "+ gcd);
	}
}
