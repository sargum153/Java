package Arrays.Array_Methods;

import java.util.Arrays;
public class MethodsExamples {
	public static void main(String[] args) {
		String[] names = {"abc", "xyz", "ghi", "def"};
	
		//System.out.println(names);
		
		//for(String s: names)
			//System.out.println(s);
		
		
		// toString
		//=============
		System.out.println(Arrays.toString(names));
		
		//deepToString (For Multi Dimensional Array or nasted array)
		//==================
		int[][] arr2 = {{1,2},{3,4}};
		System.out.println(Arrays.deepToString(arr2));
		
		//copyOfRange
		//===============
		
		String[] name = {"Sargum","Subhransu","Anuja","Sushanata","Shreya"};
		System.out.println(Arrays.toString(Arrays.copyOfRange(name, 1, 4)));
		
		//copyOf
		//===========
		 
		System.out.println(Arrays.toString(Arrays.copyOf(name, 4)));
		
		//fill
		//=======
		
		Arrays.fill(name, "Little");
		System.out.println(Arrays.toString(name));
		
		
		//equals
		//===========
		
		String[] name5 = {"Sargum","Subhransu","Anuja","Sushanata","Shreya"};
		String[] name6 = {"Sargum","Subhransu","Anuja","Sushanata","Shreya"};
		
		System.out.println(Arrays.equals(name5, name6));
		
		//For Two dimensional array equal method will be not working 
		//deepEquals
		
		int[][] arr1 = {{1,2},{3,4}};
		int[][] arr3 = {{1,2},{3,4}};
		
		System.out.println(Arrays.deepEquals(arr1, arr3));
		
		//shot
		//=======
		
		Arrays.sort(name5);
		System.out.println(Arrays.toString(name5));
		
		//compare
		//============
		
		System.out.println(Arrays.compare(name5,name6));
		
		//mismatch()
		
	//====================
		
		System.out.println(Arrays.mismatch(name5, name6));
		
		System.out.println(name5.length);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
