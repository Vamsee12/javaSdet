package Control_Statements_1;

public class PrimeNumbersUpto100 {
	
	public static void main(String[] args) {
		
		int count=0;
		
		for(int i=1;i<=100;i++) {
			
			for(int j=2;j<=i-1;j++) {
				
				if(i%j==0)
				{
				count++;
	            }
			                        }
				 if(count==0) {
					System.out.println("The given no is prime" +i);
				}
				
				else {
					count=0;
				}
		}
		
	
	}

	}

