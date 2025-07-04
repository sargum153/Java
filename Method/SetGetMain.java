package Method;

public class SetGetMain {
	public static void main(String[] args) {
		SetGet e1 = new SetGet();
		SetGet e2 = new SetGet();
		
		e1.display();
		e2.display();
		
		e1.setX(10);
		e1.setY(20);
		
		e2.setX(30);
		e2.setY(40);
		
		
	System.out.println(e1.getX() + " " + e1.getY());
	System.out.println(e2.getX() + " " + e2.getY());
	
	e1.setX(50);
	e1.setY(60);
	
	e2.setX(70);
	e2.setY(80);
	
	System.out.println(e1.getX() + " " + e1.getY());
	System.out.println(e2.getX() + " " + e2.getY());
	
	System.out.println();
	
	
	e1.display();
	e2.display();
		
	}
}
