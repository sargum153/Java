//

package Method;

class RoomAreaPerimeter {
	private double l;
	private double b;
	
	public void setL(double l) {
		this.l=l;
	}
	double getL() {
		return l;
	}
	
	public void setB(double b) {
		this.b=b;
	}
	double getB() {
		return b;
	}
	
	
	public void findArea() {
		System.out.println("Area : " + (l * b));
	}
	
	public void findPerimeter() {
		System.out.println("Perimeter : " + 2*(l + b));
	}
	
	public void display() {
		System.out.println(l);
		System.out.println(b);
	}
	
	
	
}

