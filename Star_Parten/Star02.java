package Star_Parten;
import java.util.Scanner;


class Star02 {
	public static void main(String[] args){
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter value of n: ");
		int n = scn.nextInt();
		
		
		for (int i = 0; i < n; i++){
			for (int j = n; j > i; j--){

				System.out.print("*");
				
			}
				System.out.println();
		}
	}
}
