package DataStructuresAndAlgorithms;

import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	System.out.println("Enter number for to find ut factor");
	int n = scn.nextInt();
	
	long number = 1;
	
	for(int i = 1; i <= n; i++) {
		number = number * i;
	}
	
	System.out.println("Factorial of " + n + " is " + number + "." );
		
	}
}
