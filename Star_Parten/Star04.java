package Star_Parten;
import java.util.Scanner;

class Star04 {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Please enter the Number");
		
		int n = scr.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for(int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
			
			}
			System.out.println();
			
		}
		
		
	}

}
