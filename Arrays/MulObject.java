package Arrays;

class MulObject {
	public static void main(String[] args){
		MulValue[] ea = {new MulValue(), new MulValue()};

		// Reading and Printing value from primitive array

		System.out.println("ea[0].i1[0]: " + ea[0].i1[0]);
		System.out.println("ea[0].i1[1]: " + ea[0].i1[1]);
		System.out.println("ea[0].i1[2]: " + ea[0].i1[2]);
		System.out.println();
		System.out.println("ea[1].i1[0]: " + ea[1].i1[0]);
		System.out.println("ea[1].i1[1]: " + ea[1].i1[1]);
		System.out.println("ea[1].i1[2]: " + ea[1].i1[2]);

		//Reading and Printing value from class array

		System.out.println("ea[0].i2 	:" + ea[0].i2);
		System.out.println("ea[0].d1 	:" + ea[0].d1);
		System.out.println("ea[0].ch 	:" + ea[0].ch);
		System.out.println("ea[0].la[0]  :" + ea[0].la[0]);
		System.out.println("ea[0].la[1]  :" + ea[0].la[1]);
		System.out.println("ea[0].s1		 :" + ea[0].s1);
		

		

	}
}
