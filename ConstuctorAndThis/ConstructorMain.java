package ConstuctorAndThis;

public class ConstructorMain {
	public static void main(String[] args) {
		Constructor e1 = new Constructor(); // creating object by using non parameterized 
		e1.display();						//constructor
		
		Constructor e2 = new Constructor(12, 19);//creating object by using
		e2.display(); 							// parameterized constructor
		
		System.out.println();
		
		e2.x = 23;		// modifying e2 object data
		e2.y = 67;
		
		
		Constructor e3 = new Constructor(e2);
		e2.display();							//This new object e3 data is same as
		e3.display();							// e2 object data
		
		System.out.println(e2 == e3);
		System.out.println(e2.equals(e3));
		System.out.println();
		
		
		Constructor e4 = e2;
		e2.display();
		e4.display();
		System.out.println(e2 == e4);
	}
}
