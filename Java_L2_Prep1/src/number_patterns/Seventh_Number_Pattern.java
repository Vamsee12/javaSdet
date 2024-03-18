package number_patterns;

public class Seventh_Number_Pattern {

	public static void main(String[] args) {

		int count =0;
		
		for(int i=1;i<=5;i++) 
		{
			if(i%2!=0) 
			{
				for(int j=1;j<=3;j++) 
				{
					count=count+1;
					System.out.print(count+" ");
				}
			}
			
			else 
			{
				int temp=count+1;                        //here from above if condition count=3 we are making
				
				for(int k=count+3;k>=temp;k--)          // int k=6;k>=4;k-- and printing k
				{
					
					count=count+1;                     // count ++ we need to still increase the count value
					System.out.print(k+" ");                                               
					
				}
				
			}
			
			System.out.println();
		}
   }
}



