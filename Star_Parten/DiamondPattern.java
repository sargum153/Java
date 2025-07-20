package Star_Parten;

	public class DiamondPattern {
		public static void main(String[] args) {
			int n = 3;
			for(int i = 1; i<=(n*2)-1; i++) {
				int z = i;
				if(i>n) {
					z = (n*2)-i;
				} 
				
				for(int j=1; j<=n-z; j++) {
					System.out.print(" ");
					
				}
				
				for(int k = 1; k <= (2*z)-1; k++) {
					System.out.print("*");

				}
				
				System.out.println();

			}
		}
	}
