package Method;

public class College {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		//initialization
		s1.setSno(01);
		s1.setSname("Sargum");
		
		s2.setSno(02);
		s2.setSname("Subhransu");
		
		
		// reading value
		System.out.println(s1.getSno() + " " + s1.getSname());
		System.out.println(s2.getSno() + " " + s2.getSname());
		
		//modifying value
		s1.setSno(03);
		s1.setSname("Anuja");
		
		s2.setSno(04);
		s2.setSname("sushanta");
		
		
		//Printing
		s1.display();
		s2.display();
	}
}
