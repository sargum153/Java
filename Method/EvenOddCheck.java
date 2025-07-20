//Develop a user defined method to check whether given number even or odd if even return true,
		//else return false.
				
				//in main method print 
					//number is even if return true
					//number is odd if return false

package Method;

public class EvenOddCheck {
	static boolean evenOdd(int num) {
		if(num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		int num1 = 18;
		  if(evenOdd(num1)) {
			  System.out.println(num1 + " is an even number.");
		  } else {
			  System.out.println(num1 + " is an odd number.");
		  }
	}
}

//public class EvenOddCheck {
//	
//	static boolean evenOdd(int num) {
//		
//		return num % 2 == 0;
//	}
//	
//	public static void main(String[] args) {
//		int num1 = 5;
//		int num2 = 6;
//		
//		// ternary operator
//		System.out.println(num1 + " " + (evenOdd(num1) ? "is an even number." : " is an odd number."));
//		System.out.println(num2 + " " + (evenOdd(num2) ? "is an even number." : " is an odd number."));
//	}
//
//}
