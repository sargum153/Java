package ConstructorAndSetter;

public class College {
	public static void main(String[] args) {
		StudentInfo s1 = new StudentInfo();
		
		System.out.println("s1 object is created ");
		System.out.println("\nObject s1 value before initialization");
		
		System.out.println();
		
		s1.display();
		System.out.println();
		System.out.println("Object initalization by setter method");
		
		s1.setSno(01);
		s1.setSname("Sargum");
		s1.setCourse("Java");
		s1.setFee(3500);
		
		System.out.println("Object display value using display method");
		System.out.println();
		
		s1.display();
		
		System.out.println();
		
		System.out.println("Object2 is created by using passed values in parameter");
		
		StudentInfo s2 = new StudentInfo(02, "Subhransu", "Java", 4000);
		System.out.println();
		s2.display();
		
		System.out.println();
		System.out.println("Modifying s2 object value");
		
		
		s2.setCourse(s2.getCourse() + ", Politics");
		s2.setFee(s2.getFee() + 5000);
		
		System.out.println();
		
		System.out.println("Object value after Modification");
		System.out.println();
		
		s2.display();
		
		
	}
}
