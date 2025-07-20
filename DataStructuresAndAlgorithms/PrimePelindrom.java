package DataStructuresAndAlgorithms;

import java.util.Scanner;
public class PrimePelindrom {

	// method for find out pelindrom
	public static boolean isPelindrom(int n) {
		int original = n;
		int rev = 0;
		
		while(n != 0) {
			rev = rev * 10 +(n%10);
			n = n/10;
		}
		
		return rev == original;
	}
	
	//method for find out prime
	
	public static boolean isPrime(int n) {
		if(n <= 1) {
			return false;
		} 
		
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Ener a number to check Pelindrom Prime or not.");
		
		int n = scn.nextInt();
		
		boolean prime = isPrime(n);
		boolean pelindrom = isPelindrom(n);
		
		if(prime && pelindrom) {
			System.out.println(n + " is a both Prime and Pelindrom number.");
		} else if (pelindrom) {
			System.out.println(n + " is a Pelindrom number.");
		} else if (prime) {
			System.out.println(n + " is a Prime number.");
		} else {
			System.out.println(n + " is neither a Prime number nor a Pelindrom number.");
		}
		
		
		
	}
}
