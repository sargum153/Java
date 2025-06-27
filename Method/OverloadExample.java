package Method;

public class OverloadExample {
	// method 1
	public static int add(int a, int b) {
		return a + b;
	}
	
	// method 2
	public static int add(int a, int b, int c) {
		return a + b + c;
	}
	// method 3
	public static double add(double a, double b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		System.out.println(add(2,3));
		System.out.println(add(2,3,4));
		System.out.println(add(2.30,3.40));
	}
}
