
package SetGet;

import java.util.Scanner;

public class BuildingRVs {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter l: ");
		double l = scn.nextDouble();
		
		System.out.println("Enter b: ");
		double b = scn.nextDouble();
		
		RoomUsingConstructorAndSet r1 = new RoomUsingConstructorAndSet(l,b);
			r1.display();
			System.out.println();
			
			r1.findArea();
			r1.findPerimeter();
			
			System.out.println();
			
			
			// modify the l and b value
			
			System.out.println("Enter modify l value : ");
			r1.setL(scn.nextDouble());
			
			System.out.println("Enter modify b value : ");
			r1.setB(scn.nextDouble());
			
			r1.display();
			
		
	}
}
