// a nameless block that is created inside a class outside of all methods

// it is used for initializing static variable and execute same logic only once at the time
//of class loading into JVM
package BlockAndTypes;

public class StaticInitializerBlock {
	static {
		System.out.println("SIB");
	}
	
	static void main() {
		System.out.println("SM");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method");
	}
}
