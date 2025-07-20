package SetGet;

public class Building {
	public static void main(String[] args) {
		 Room r1 = new Room();
		 
		 r1.display();
		 
		 System.out.println();
		 
		 r1.setL(100);
		 r1.setB(30);
		 
		 r1.display();
		 
		 r1.findArea();
		 r1.findPerimeter();
	}
}
