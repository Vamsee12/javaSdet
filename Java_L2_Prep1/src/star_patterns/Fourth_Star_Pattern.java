package star_patterns;
// * * * * * 
//   * * * *
//     * * *
//       * *
//         *

// if we don't want to print space in first row instead of j=1 intialize j=2

public class Fourth_Star_Pattern {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) 
		{
			for(int j=2;j<=i;j++) 
			{
			    System.out.print(" ");	
			}
			
			for(int k=5;k>=i;k--) 
			{
				System.out.print("*");
			}
			
			System.out.println();
			
		}

	}

}
