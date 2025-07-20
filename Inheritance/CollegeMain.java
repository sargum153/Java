package Inheritance;


import java.util.Scanner;
 class person {
	 //static variables
	private static int eyes;
	private static int ears;
	private static int hands;
	private static int legs;
	
	// non static variables
	
	private String name;
	private double height;
	private double weight;
	
	//static block
	static {
		eyes = 2;
		ears = 2;
		hands = 2;
		legs = 2;
	}
	
	//parameterized constructor
	public void Person (String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		
	}
	
	// setter getter method for static field
	public static int getEyes() {
		return eyes;
	}
	public static void setEyes(int eyes) {
		person.eyes = eyes;
	}
	
	public static int getEars() {
		return ears;
	}
	public static void setEars(int ears) {
		person.ears = ears;
	}
	
	public static int getHands() {
		return hands;
	}
	public static void setHands(int hands) {
		person.hands = hands;
	}
	
	public static int getLegs() {
		return legs;
	}
	public static void setLegs(int legs) {
		person.legs = legs;
	}
	
	
	//Setter getter method for non static fields
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	// Business Logic
	public void eat() {
		System.out.println(name + " is eating.");
	}
	public void sleep() {
		System.out.println(name + " is Sleeping.");
	}
	
	@Override
	public String toString() {
		return  "eyes\t\t: " + eyes + "\n"+
				"ears\t\t: " + ears + "\n"+
				"legs\t\t: " + legs + "\n"+
				"name\t\t: " + name + "\n"+
				"height\t\t: " + height + "\n"+
				"weight\t\t: " + weight;
				
	}
}

 
 
 
 
 
 
 
 
class Student extends Person {			//inheritance
	//static field with data hiding
	private static String institute;
	
	//non static field with data hiding
	private int sno;
	private String course;
	private double fee;
	
	
	//static block
	static {									//encapsulation
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter institute: ");
		institute = scn.nextLine();
	}
	
	//method
	public Student(String name, double height, double weight,
			int sno, String course, double fee) {
		
		//super refers to parent class
		super(name, height, weight);
		
		//this we use for the current class
		this.sno	= sno;
		this.course = course;
		this.fee	= fee;
	}
	
	public static String getInstitute() {
		return institute;
	}
	public static void setInstitute(String institute) {
		Student.institute = institute;
	}
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	
	
	// business method
	public void listen() { 
		System.out.println(name + " is listening "+ course);
	}
	
	public void reply() { 
		System.out.println(name + " is replying to "+ course + " questions");
	}
	
	public void read() {
		System.out.println(name + " is reading "+ course + " material");
	}
	
	public void write() { 
		System.out.println(name + " is writing " + course + " notes");
	}
	
	
	@Override
	public String toString() {
		return super.toString() + "\n" +
					" institute\t: " + institute + "\n" +
					" sno\t\t: " + course + "\n" +
					""
		
	}
	
}



 public class CollegeMain {
	public static void main(String[] args) {
		
	}
}
	
