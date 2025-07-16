//0,1,1,2,3,5,8,13,21

package DataStructuresAndAlgorithms;

import java.util.Scanner;
public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter range for Fibonacci Series.");
		
		int num = scn.nextInt();
		
		int a = 0, b = 1;
		
		System.out.println("The Fabonacci Series upto " + num);
		for(int i =1; i<=num; i++) {
			System.out.print(a + " ");
			
			int next = a + b;
			a = b;
			b = next;
		}
	}
}
