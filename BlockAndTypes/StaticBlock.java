package BlockAndTypes;

import java.util.Scanner;
public class StaticBlock {
	static int a; 
	
	static {			// static block
		Scanner scn = new Scanner(System.in);
		System.out.print("Please enter a value for a : ");
		a = scn.nextInt();
		System.out.println("From Static Block: " + a);
		
	}
	
	public static void main(String[] args) {
		System.out.println("From Main method a: " + a);
		m1();
	}
	
	public static void m1() {
		System.out.println("From static method m1 : " + a);
	}
}
