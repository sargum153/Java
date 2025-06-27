package DataStructuresAndAlgorithms;

public class PrimeNumber {
	public static boolean isPrimeNumber(int n) {
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		 return true;
	}
	
	public static void main(String[] args) {
		int n = 17;
		
		if (isPrimeNumber(n)) {
			System.out.println(n + " is a prime number.");
		} else {
			System.out.println(n + " is not a prime number.");
		}
	}
}
