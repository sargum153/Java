package Encapsulation;


import java.util.Scanner;
import java.util.InputMismatchException;
public class BikeRider {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		Bike b1 = new Bike();
		while(true) {
			try {
				System.out.print("\nChange Gear :");
				//int newGear = scn.nextInt();
				
				b1.setGear(scn.nextInt());
				b1.currentGear();
			}catch(InputMismatchException e) {
				System.out.println("Pass only integer Number");
				scn.nextLine();
			}catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
				
			}
		}
	}
}
