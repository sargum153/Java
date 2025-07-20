//Develop a program to store String objects(names) as one group by using  
//array object. Read and print those objects in all 4 approaches.



package Arrays;

public class StoreStringObjectName {
	public static void main(String[] args) {
		String[] object = {"sargum","Subhransu","Anuja","Sushanta","Archita"};
		
		// print value directly
		
		System.out.println(object[0]);
		System.out.println(object[1]);
		System.out.println(object[2]);
		System.out.println(object[3]);
		System.out.println(object[4]);
		
		// print using for loops
		
		for(int i = 0; i < object.length; i++) {
			System.out.println(object[i]);
		}
		
		// print using for each loop
		
		for(String Arr : object) {
			System.out.println(Arr);
		}
		
		// print using predefined method Arrays.toString(-)
		
		System.out.println(java.util.Arrays.toString(object));
	}
}
