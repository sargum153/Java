//Print 1 to n number, and take number from user.

package DataStructuresAndAlgorithms;

import java.util.Scanner;
public class ReverseNum {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Please eneter a number");
		
		int n = scn.nextInt();
		
		for(int i = n; i >= 1; i--) {
			System.out.println(i);
		}
		
	}
}
