package DataStructuresAndAlgorithms;

import java.util.Scanner;
public class PerfectNumberRange {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter a number.");
		int n = scn.nextInt();
		
		for(int num = 2; num <= n; num++) {
			int sum = 0;
			for(int i = 1; i < num; i++) {
				if(num % i == 0) {
					sum = sum + i;
				}
			}
			
			if(sum == num) {
				System.out.println(num + " is a perfect number.");
			}
		}

		scn.close();
	}
}
