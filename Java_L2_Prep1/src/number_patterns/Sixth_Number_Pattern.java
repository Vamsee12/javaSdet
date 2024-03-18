package number_patterns;

// 1
// 2 6 
// 3 7 10
// 4 8 11 13
// 5 9 12 14 15
 
public class Sixth_Number_Pattern {

	public static void main(String[] args) {
		
		for(int i=1;i<=7;i++) 
		{
			int no=i;
			
			for(int j=1;j<=i;j++) 
			{
				System.out.print(no+" ");
				
				no = no+7-j;                       // as we have 7 rows, if we have 5 then replace 7 with 5
			}
			
			System.out.println();
		}

	}

}
