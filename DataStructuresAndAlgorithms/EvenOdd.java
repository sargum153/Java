package DataStructuresAndAlgorithms;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number for checking Even or Odd.");
		
		int num = scn.nextInt();
		
		findEvenOdd(num);
	}
	
	public static void findEvenOdd(int num) {
		if(num % 2 == 0) {
			System.out.println(num + " is a Even Number.");
		} else {
			System.out.println(num + " is a Odd Number");
		}
	}

}
