package DataStructuresAndAlgorithms;

import java.util.Scanner;
public class PerfectNumber2ndApproaches {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter a number to check perfect number or not");
		int num = scn.nextInt();
		
		int sum = 1;
		
		for(int i = 2; i < num; i ++) {
			if(num % i == 0)
				sum = sum + i;
				
		} if(sum == num) {
			System.out.println(num + " is a perfect number.");
		} else {
			System.out.println(num + " is not a perfect number.");
		}
	}
}
