// Develop a program to count number of object create from a class. This call can contain over
//loaded constructor, user can create object of this class by call any of the available constructor


package BlockAndTypes;

public class BlockAssignment {
	private static int count = 0;
	
	{  // non static block
		count ++;
		
	}
	BlockAssignment(){
		System.out.println("NPC");
	}
	
	BlockAssignment(int x){
		System.out.println("IPC");
	}
	
	BlockAssignment(String a){
		System.out.println("SPC");
	}
	
	public static int getCount() {
		return count;
	}
	
	public static void main(String[] args){
		BlockAssignment e1 = new BlockAssignment();
		BlockAssignment e2 = new BlockAssignment(10);
		BlockAssignment e3 = new BlockAssignment("a");
		BlockAssignment e4 = new BlockAssignment();
		
		System.out.println("Number of objects : " + BlockAssignment.getCount());
	}
}

//class Test {
	
//}
