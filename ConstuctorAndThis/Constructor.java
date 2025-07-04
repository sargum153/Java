package ConstuctorAndThis;

public class Constructor {
	int x;
	int y;
	
	// no parameter constructor
	
	Constructor(){
		x = 10;
		y = 20;
	}
	
	// parameter constructor
	
	Constructor(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	// copy constructor
	
	Constructor(Constructor e){
		this.x= e.x;
		this.y= e.y;
	}
	
	public void display() {
		System.out.println(x + " " + y);
	}
}
