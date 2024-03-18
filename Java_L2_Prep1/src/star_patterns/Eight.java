package star_patterns;

//   *******
//    *****
//     ***
//      *
public class Eight {

	public static void main(String[] args) {
		 for(int i=1;i<=4;i++)
		 {
			 //spaces
			for(int j=2;j<=i;j++) 
			{
				System.out.print(" ");
				
			}
			
			//stars
			for(int k=4;k>=i;k--) 
			{
				System.out.print("*");
			}
			
			//stars
			for(int l=3;l>=i;l--) 
			{
				System.out.print("*");
			}
			
			System.out.println();
		 }

	}

}
