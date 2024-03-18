package Control_Statements_1;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    int rev=0,rem,t1,armstrong;
	    int len=0;
			
		System.out.println("Enter the number to find armstrong or not : ");
		    int num = sc.nextInt();
		    t1=num;
		    
		    while(t1!=0)
		    {
		    	t1 =t1/10;               //to find length of number
		    	len=len+1;
		    }
		    
		    System.out.println(len);
		    
		    int t2=num;
		    int arm=0;
		    
		    while(t2!=0) {
		    	int mul=1;
		    	rem=t2%10;
		    	for(int i=1;i<=len;i++) {      //iterating length (for arm we 
		    		
		    		mul=mul*rem;
		    		
		    		
		    	}
		    	arm=arm+mul;
		    	t2=t2/10;
		    	
		    }
		    if(num==arm) {
		    	System.out.println("num is arm");
		    }
		    else {
		    	System.out.println("num is not arm");
		    }
		    
		    		    
	}

}
