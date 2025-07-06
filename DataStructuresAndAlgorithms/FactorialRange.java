package DataStructuresAndAlgorithms;


import java.util.Scanner;
public class FactorialRange {
	
	static int fact(int n) {
		
		int fact = 1;
		
		while(n>0) {
			fact = fact * n;
			
			n--;
		}
		
		return fact;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("please enter a number");
		int n = scn.nextInt();
		
		for(int i = 1; i <= n; i ++) {
			System.out.println(i + "!---- " + " is " + fact(i));
		}
	}
	
}
