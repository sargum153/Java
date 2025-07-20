//Develop a program to implement encapsulation for a Voter application.

//The program should allow issuing a voter card only if the person's age is between 18 and 120.

//If the age is invalid, throw an exception.

//If the age is valid, display:


package Encapsulation;

public class Voter {
	
	private int age;
	private String name;
	
	public void setAge(int age) throws IllegalArgumentException {
		if(age < 18 || age > 120) {
			throw new IllegalArgumentException("You are not elligiable for votting.");
		} 
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	
	public void setName(String name) throws IllegalArgumentException{
		if (name == null || name.trim().isEmpty() || name.matches("\\d+")) {
		    throw new IllegalArgumentException("Invalid name: Cannot be empty or a number.");
		}
		
		this.name= name;
	}
	
	public String getName() {
		return name;
	}
	
	
}
