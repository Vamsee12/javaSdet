package star_patterns;
//   *
//    *
//     *
//      *
//       *


//        *
//       *
//      *
//     *
//    *
public class Ninth_Star_Pattern {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) 
		{
			for(int j=2;j<=i;j++) 
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=1;k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println(" ");
		
		for(int i=1;i<=5;i++) 
		{
			for(int j=4;j>=i;j--) 
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=1;k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		

	}

}
