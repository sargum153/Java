package DataStructuresAndAlgorithms;


import java.util.Scanner;
public class StrongNumber {
	
	// method 
	public static int factorila(int n) {
		int fact = 1;
		
		for(int i = 2; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}
	
	//main method
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Eneter a number to check that number is strong or not: ");
		int num = scn.nextInt();
		
		int number = num;
		int sum = 0;
		
		while(num > 0) {
			int digit = num % 10; // last digit
			sum = sum + factorila(digit);
			num = num / 10;
		}
		
		if(sum == num) {
			System.out.println(number + " is a Strong number.");
		} else {
			System.out.println(number + " is not a Strong number.");
		}
		
		scn.close();
	}
}
