package star_patterns;

//          *
//        * *
//      * * *
//    * * * *

//first print spaces and then print stars


public class Third_Star_Pattern {

	public static void main(String[] args) {
		
         for(int i=1;i<=4;i++) 
         {
        	 //Spaces
        	 for(int j=3;j>=i;j--) 
        	 {
        		 System.out.print(" ");
        	 }
        	 
        	 //Stars
        	 for(int k=1;k<=i;k++) 
        	 {
        		 System.out.print("*");
        	 }
            	 
             System.out.println();  
             
         }
	}

}
