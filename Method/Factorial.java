package Method;

public class Factorial {
	
	public static int factorialNum(int n) {
		int mul = 1;
		
		for(int i = 2; i <= n; i++) {
			mul *= i;
		}
		
		return mul;
	}
	
	public static void main(String[] args) {
		int n = 10;
		//factorialNum(n);
		System.out.println("The Factorial of " + n + " is: " + factorialNum(n));
	}

}
