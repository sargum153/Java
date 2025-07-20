//Develop a program to encapsulate Bike gear, allowing the user to set the gear only between 0 and 5.

//If the user sets an invalid gear, throw an exception.

//If the user sets a valid gear, display:


package Encapsulation;


public class Bike {

	private int gear;
	
	public void setGear(int gear) throws IllegalArgumentException {
		if(gear < 0 || gear > 5) {
			
			throw new IllegalArgumentException ("Invalid gear. It must be in between (0 to 5)");
		}
		
		this.gear=gear;
	}
	
	public int getGear() {
		return gear;
	}
	
	public void currentGear() {
		if(gear == 0) {
			System.out.println("Bike is in Neutral");
		} else {
			System.out.println("Bike is Running on gear " + gear);
		}
	}
}
