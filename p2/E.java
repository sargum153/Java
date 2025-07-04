package p2;
import p1.A;
class E extends A{
	public static void main(String[] args) {
		A a1 = new A();
		//System.out.println(a1.c);
		System.out.println(a1.d);
		System.out.println();
		
		C c1 = new C();
		//System.out.println(c1.c);
		System.out.println(c1.d);
		
		E e2 = new E();
		System.out.println(e2.c);
		System.out.println(e2.d);
		
	}
}
