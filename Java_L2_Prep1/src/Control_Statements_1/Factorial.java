package Control_Statements_1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		long fact =1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number for finding factorial : ");
	    long num = sc.nextLong();
	    
	    for(long i=num;i>=1;i--) {
	    	
	    	fact = fact*i;
	    	
	    }
	    
	    System.out.println(fact);
	    
	    

	}

}

//factorial => 6! = 6*5*4*3*2*1
