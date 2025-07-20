package Star_Parten;

import java.util.Scanner;
public class DiamondPattern_2 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		 System.out.println("Enter Odd number only");
		 
		 int n = scn.nextInt();
		 int mid = (n+1)/2;
		 
		 for(int i =1; i <= n; i++) {
			 int z = i;
			 
			 if(i>mid) {
				 z = n - i +1;
			 }
			 
			 for(int j =1; j<=mid-z; j++) {
				 System.out.print(" ");
			 }
			 for(int k = 1; k<=(2*z)-1; k++) {
				 System.out.print("*");
			 }
			 
			 System.out.println();
		 }
	}
}
