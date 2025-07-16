package DataStructuresAndAlgorithms;

import java.util.Scanner;
public class StrongNumberRange {
	
	static int factorial(int n) {
		int fact = 1;
		
		while(n > 0) {
			fact = fact * n;
			n--;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter range to find out Strong number.");
		int num = scn.nextInt();
		
		for(int i = 1; i <= num; i++) {		// i =1, 1 <= 5(true)
			
			int oriNum = i;
			int sum = 0;
		
			
			while(oriNum != 0) {
				int r = oriNum % 10;
				
				sum = sum + factorial(r);
				oriNum = oriNum/10;	
			}
			
			if(sum == i) {
				System.out.println(i + " is a Strong number.");
			}
		}
	}
}