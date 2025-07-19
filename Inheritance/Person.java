package Inheritance;

class Person {
	String name;
	
	void eat() {
		System.out.println(name + " is eating");
	}
	void sleep() {
		System.out.println(name + " is eating");
	}
	
}

class Student extends Person {
	int sno;			// extend person functionality
	String course;
	
	void listen() {
		System.out.println(name + " is listening " + course);
	}
	
	void reply() {
		System.out.println(name + " is replying to " + course + " questions.");
	}
	
	void read() {
		System.out.println(name + " is reading " + course + " notes.");
	}
	
	
}
