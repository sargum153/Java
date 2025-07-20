package DataStructuresAndAlgorithms;

import java.util.Scanner;
public class MultiplicationTable {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter value of n");
		int n = scn.nextInt();
		
		for(int i = 1; i<=10; i++) {
			System.out.println(n +" * " + i + " = " + n*i);
		}
	}
	
}
