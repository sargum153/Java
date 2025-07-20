// A nameless block that is placed inside class outside method without static keywords..

// it is used for initializing instance variables and executing same logic only once at
//the time of object creation.

package BlockAndTypes;

public class InstanceInitializerBlock {
	{ // IIB
		System.out.println("Instance Initializer Block");
	}
	
	InstanceInitializerBlock(){
		System.out.println("NPC");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method");
		System.out.println();
		InstanceInitializerBlock e1 = new InstanceInitializerBlock();
	}
}
