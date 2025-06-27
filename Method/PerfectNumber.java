//Develop a UDM to check whether given number is perfect number or not

package Method;
public class PerfectNumber {
	public static boolean isPerfectNumber(int num) {
		
		int sum = 0;
		for(int i = 1; i < num; i++) {
			if(num % i == 0) {
				sum += i;
			}
		}
		 
		return sum == num;
	 }
	
	public static void main(String[] args) {
		int num = 128;
		
		if(isPerfectNumber(num)) {
			System.out.println(num + " is a perfect number.");
		} else {
			System.out.println(num + " is not a perfect number.");
		}
	}
}
