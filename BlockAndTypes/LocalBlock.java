// A nameless block that is created inside a method. 
// it is used for destroying local variable after used is completed.

package BlockAndTypes;

public class LocalBlock {
	void m1(int p) {
		int q = 60;
		{
			int r = 70;
			//System.out.println(r);.
		}
	}
	
	public static void main(String[] args) {
		//System.out.println(p); // p is parameter in method m1() so not accessible here.
		//System.out.println(q);	// q is local to method m1 so not accessible in main
		//System.out.println(r);	// r is inside a local block in m1(), also not accessible in main()
		int r = 80;
		System.out.println(r);
	}
}
