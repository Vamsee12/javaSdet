package star_patterns;


//    ******
//    *    *
//    *    *
//    *    *
//    ******
public class Eleventh_Star_Pattern {

	public static void main(String[] args) {
		//rows
		for(int i=1;i<=6;i++) 
		{
			//columns
			for(int j=1;j<=6;j++) 
			{
				//spaces
				if((i>=2 && j>=2) && (i<=5 && j<=5)) 
				{
					System.out.print(" ");
				}
				
				//stars
				else 
				{
					System.out.print("*");
				}
				
			}
			
			System.out.println();
			
		}
	}

}
