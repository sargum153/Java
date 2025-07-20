package Arrays;

public class SmallestElement {

	public static void main(String[] args) {
		int[] num = {12,3,23,1,4,0};
		int small = num[0];
		
		for (int i = 1; i < num.length; i++) {
			if(num[i] < small) {
				small = num[i];
			}
		}
		
		System.out.println("The smallest number is : " + small);
	}

}
