package p2;
import p1.A;

class C extends A{
	public static void main(String[] args) {
		A e1 = new A();
		
		//System.out.println(e1.a);
		//System.out.println(e1.b);
		//System.out.println(e1.c);
		System.out.println(e1.d);
		System.out.println();
		
		C e2 = new C();
		//System.out.println(e2.a);
		//System.out.println(e2.b);
		System.out.println(e2.c);
		System.out.println(e2.d);
	}
}
