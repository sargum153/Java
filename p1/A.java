package p1;
public class A {
	
	private int a = 10;
			int b = 20;
	protected int c = 30;
	public int d = 40;
	
	
	public static void main(String[] args) {
		A e1 = new A();
		
		System.out.println(e1.a); //10
		System.out.println(e1.b);	//20
		System.out.println(e1.c);	//30
		System.out.println(e1.d);	//40
	}
}
