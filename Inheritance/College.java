package Inheritance;

public class College {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "Sargum";
		//p1.sno = 101;
		
		Student s1 = new Student();
		s1.name = "Sargum";
		s1.sno = 101;
		s1.course = "java";
		
		s1.listen();
		s1.reply();
		s1.read();
		
		s1.eat();
		s1.sleep();
		
	}
}


