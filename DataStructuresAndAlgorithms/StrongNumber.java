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
		System.out.println("Enter a number to check Strong Number: ");
		int num = scn.nextInt();
		
		int t = num;
		int sum = 0;
		while(num > 0) {
			int r = num % 10;
			sum = sum + factorila(r);
			num = num / 10;
		}
		
		if(sum == t) {
			System.out.println(t + " is a Strong number.");
		} else {
			System.out.println(t + " is not a Strong number.");
		}
	}
}
