package Star_Parten;

import java.util.Scanner;

public class Star03 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter value of n: ");
		int n = scn.nextInt();
		
		for(int i = n; i >= 1; i--) {
			for (int j = 1; j <= n -i; j++) {
				System.out.print(" ");
			}
			
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
