// Below program explains initializing Non static variable in Instance Initialization
//Block common to all object

package BlockAndTypes;

public class InstanceBlock {
	int x;
	int y;
	
	{
		x = 10;
		System.out.println("IIB");
	
	}
	
	InstanceBlock(){
		y = 10;
		System.out.println("NPC");
	}
	InstanceBlock(int y){
		this.y = y;
		System.out.println("PC");
	}
	
	public static void main(String[] args) {
		System.out.println("MM");
		System.out.println();
		InstanceBlock e1 = new InstanceBlock();
		System.out.println();
		InstanceBlock e2 = new InstanceBlock(30);
		System.out.println("e1 object value: " + e1.x + "\t" + e1.y);
		System.out.println("e2 object value: " + e2.x + "\t" + e2.y);
	}
}
