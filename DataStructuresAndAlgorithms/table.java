package DataStructuresAndAlgorithms;

import java.util.Scanner;
public class table {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = scn.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			for(int j =1; j<= n; j++) {
				System.out.print(j + "*" + i + "=" + j * i + "\t");
			}
			System.out.println();
		}
		
	}
}
