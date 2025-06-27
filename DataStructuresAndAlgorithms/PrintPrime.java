package DataStructuresAndAlgorithms;

import java.util.Scanner;
public class PrintPrime {
	
	public static void main(String[] args) {
		 
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number to find all prime number between 1 to n.");
		
		int n = scn.nextInt();
		
		for(int i=2; i<n; i++) {
			if(n % i == 0) {
				System.out.println(i);
			} else {
				System.out.println("");
			}
			
			System.out.println();
		}
	}
}
