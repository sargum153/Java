//Develop a program to store floating-point values as one group by using  
//array object. Read and print those values in all 4 approaches.


package Arrays;

public class FloatValueStore {
	public static void main(String[] args) {
		double[] value = {10.5,23.6,48.9};
		// or
		Float[] val = {10.5f,23.6f,48.9f,77.7f};
		
		// print value directly
		
		System.out.println(value[0]);
		System.out.println(value[1]);
		System.out.println(value[2]);
		
		// print using for loops
		
		for(int i = 0; i < value.length; i++) {
			System.out.println(value[i]);
		}
		
		// print using for each loop
		
		for(double num : value ) {
			System.out.println(num);
		}
		
		// print using predefined method Arrays.toString(-)
		
		System.out.println(java.util.Arrays.toString(val));
	}
	

}
