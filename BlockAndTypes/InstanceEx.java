package BlockAndTypes;

public class InstanceEx {
	{ // IIB
		System.out.println("Instance Initializer Block");
	}
	
	InstanceEx(){
		System.out.println("NPC");
	}
	InstanceEx(int x){
		System.out.println("PC");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method");
		System.out.println();
		InstanceEx e1 = new InstanceEx();
		System.out.println();
		InstanceEx e2 = new InstanceEx(10);
	}
}
