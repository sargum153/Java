package ConstructorAndSetter;

import java.util.Scanner;
public class CollegeUserInput {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		
		StudentInfo s1 = new StudentInfo();
		System.out.println("Enter Student1 value");
		
		System.out.println("sno : ");
		s1.setSno(scn.nextInt());  scn.nextLine();
		
		System.out.println("Sname : ");
		s1.setSname(scn.nextLine());
		
		System.out.println("Course : ");
		s1.setCourse(scn.nextLine());
		
		System.out.println("Fee : ");
		s1.setFee(scn.nextDouble());
		
		System.out.println("Object Value after Initialization");
		System.out.println();
		s1.display();
		
		System.out.println();
		
		System.out.println("Enter Student2 Value");
		
		System.out.println();
		
		System.out.println("sno : ");
		int sno = scn.nextInt();  scn.nextLine();
		
		System.out.println("Sname : ");
		String sname = scn.nextLine(); 
		
		System.out.println("Course : ");
		String course = scn.nextLine();
		
		System.out.println("Fee : ");
		double fee = scn.nextDouble();
		
		System.out.println("Object2 Created");
		StudentInfo s2 = new StudentInfo(sno, sname, course, fee);
		
		System.out.println();
		
		s2.display();
		
		
		// Value modifying 
		s2.setCourse(s2.getCourse() + ", SQL");
		s2.setFee(s2.getFee() + 2500);
		
		System.out.println();
		s2.display();
	}
}
