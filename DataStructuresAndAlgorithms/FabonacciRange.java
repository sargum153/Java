package DataStructuresAndAlgorithms;

import java.util.Scanner;
public class FabonacciRange {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter Range to find out fabonacci number");
		int range = scn.nextInt();
		
		int a = 0, b = 1;
		
		while(a <= range) {
			System.out.print(a + " ");
			
			int next = a + b;
			a = b;
			b = next;
		}
		
	}
}
