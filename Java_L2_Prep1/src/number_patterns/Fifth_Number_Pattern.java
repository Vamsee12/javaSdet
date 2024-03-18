package number_patterns;

public class Fifth_Number_Pattern {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) 
		{
			for(int j=5;j>=i;j--) 
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
		}

	}

}
