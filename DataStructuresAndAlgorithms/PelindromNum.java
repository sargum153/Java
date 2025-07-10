package DataStructuresAndAlgorithms;


import java.util.Scanner;
public class PelindromNum {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number to check pelindrom or not: ");
		int n = scn.nextInt();
		
		int t = n;
		int rev = 0;
		
		while(n != 0) {
			rev = rev * 10 + (n % 10);
			
			n = n/10;
		}
		
		if (rev == t) {
			System.out.println(t + " is a pelindrom.");
		} else {
			System.out.println(t + " is not pelindrom.");
		}
	}
}
