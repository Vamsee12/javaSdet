package Control_Statements_1;

public class SwappingOfTwoNumbers {

	public static void main(String[] args) {
		int a=103,b=278;
		//int t;
		
		//By using a third variable
		//t=a;
		//a=b;
		//b=t;
		
		//Without using a third variable
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("value of a: "+a+" "+"value of b: "+b);
		

	}

}
