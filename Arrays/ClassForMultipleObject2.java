package Arrays;

public class ClassForMultipleObject2 {
	public static void main(String[] args) {
		int a = 10;
		
		ClassForMultipleObject e1 = new ClassForMultipleObject();
		
		System.out.println("a :" + a);
		System.out.println("e1.ia :" + e1.ia);
		System.out.println("e1.d1 :" + e1.d1);
		System.out.println("e1.ch :" + e1.ch[0]);
		System.out.println("e1.ch :" + e1.ch[1]);
		System.out.println("e1.la :" + e1.la[0]);
		System.out.println("e1.la :" + e1.la[1]);
		System.out.println("e1.s1 :" + e1.s1);
		
		
		// Storing multiple object and multiple value or creating array object by
		//using PDT and RDT classname
		
		int[] ia1 = {2,3,4};
		
		
		ClassForMultipleObject[] e2 = {new ClassForMultipleObject(), new ClassForMultipleObject()};
		
		System.out.println("ia1[0] :" + ia1[0]);
		System.out.println("ia1[1] :" + ia1[1]);
		System.out.println("ia1[2] :" + ia1[2]);
		
		System.out.println("e2[0].ia1[0] :" + e2[0].ia);
		System.out.println("e2[0].ia1[0] :" + e2[0].d1);
		System.out.println("e2[0].ia1[0] :" + e2[0].ch[0]);
		System.out.println("e2[0].ia1[0] :" + e2[0].ch[1]);
		System.out.println("e2[0].ia1[0] :" + e2[0].la[1]);
		System.out.println("e2[0].ia1[0] :" + e2[0].la[0]);
		System.out.println("e2[0].ia1[0] :" + e2[0].s1);
		
		System.out.println();
		
		System.out.println("e2[0].ia1[0] :" + e2[1].ia);
		System.out.println("e2[0].ia1[0] :" + e2[1].d1);
		System.out.println("e2[0].ia1[0] :" + e2[1].ch[0]);
		System.out.println("e2[0].ia1[0] :" + e2[1].ch[1]);
		System.out.println("e2[0].ia1[0] :" + e2[1].la[1]);
		System.out.println("e2[0].ia1[0] :" + e2[1].la[0]);
		System.out.println("e2[0].ia1[0] :" + e2[1].s1);
		
		
	}
	
	
	
}
