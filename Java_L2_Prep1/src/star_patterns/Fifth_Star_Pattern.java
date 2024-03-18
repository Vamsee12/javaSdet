package star_patterns;
//
//              *
//            * *
//          * * *
//        * * * *
//      * * * * *
//        * * * *
//          * * *
//            * *
//              *
        
        
public class Fifth_Star_Pattern {

	public static void main(String[] args) {
 		// 1 (*) to 5 (* * * * *)
		for(int i=1;i<=5;i++) 
		{
			for(int j=4;j>=i;j--) 
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++) 
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		//4 (* * * *) to 1 (*)
		for(int i=1;i<=4;i++) 
		{
			
			for(int j=1;j<=i;j++) 
			{
				
				System.out.print(" ");
			}
			
			for(int k=4;k>=i;k--) 
			{
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}
		
	}

}
