// to display sum of 1 to n number.
package DataStructuresAndAlgorithms;

import java.util.Scanner;
public class SumOfNumber {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Please eneter a number");
		
		int n = scn.nextInt();
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			
			sum += i;
			
		}
		System.out.println("The sum of 1 to " + n + " is " + sum +".");
	}
}
