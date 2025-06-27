package Arrays;
class LargestElement {
	
	public static void main(String[] args) {
		
		int[] numbers = {23,1,52,22,45};
		
		int largest = numbers[0];
		
		for(int i = 1; i < numbers.length; i++) {
			
			if(numbers[i] > largest) {
				largest = numbers[i];
			}
			
		}
		
		System.out.println("The largest element is: " + largest);
		
	}
}