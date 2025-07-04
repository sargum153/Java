package SetGet;

public class BuildingUsingConstructorAndSet {
	public static void main(String[] args) {
		RoomUsingConstructorAndSet r2 = new RoomUsingConstructorAndSet(100,50);
		
		r2.display();
		
		r2.findArea();
		r2.findPerimeter();
		
		System.out.println();
		
		r2.setL(90);
		r2.setB(30);
		
		r2.findArea();
	}
}
