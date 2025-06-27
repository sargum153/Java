//we have defined a method named add() that sum up the two numbers. It has two parameters n1 and 
//n2 of integer type. The values of n1 and n2 correspond to the value of a and b,
//respectively. Therefore, the method adds the value of a and b and store it in the
//variable s and returns the sum.
package Method;

public class Addition {
	
	public static void main(String[] args) {
		int a = 19;
		int b = 20;
		int c = add(a, b);
	System.out.println("The sum of " + a + " and " + b + " is " + c );	
	}
	
	public static int add(int n1, int n2) {
		int s = n1 + n2;
		return s;
	}
}
