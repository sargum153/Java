package ConstuctorAndThis;

class Car {
	String model; //instance variable
	int year;	 // instance variable
	
	// Constructor
	Car(String model, int year){
		this.model=model; //  using this keyword we refers instance variable
		this.year=year;
	}
	//methods
	void display() {
		System.out.println("Model: " + model + ", year: " + year);
	}
	
	public static void main(String[] args) {
		Car s1 = new Car("Hunda City", 2021);
		Car s2 = new Car("Toyata Innova", 2024);
		
		s1.display();
		s2.display();
	}
}
