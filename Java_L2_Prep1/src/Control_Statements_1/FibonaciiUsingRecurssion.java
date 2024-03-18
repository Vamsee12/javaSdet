package Control_Statements_1;

public class FibonaciiUsingRecurssion {
static int a=0,b=1,c;
	public static void main(String[] args) {
		
		System.out.print(a+" "+b);
		FibonaciiUsingRecurssion f = new FibonaciiUsingRecurssion();
		f.fibonacii(10);

	}
	
	void fibonacii(int i) {
		
		if(i>=1) {
		c=a+b;
		System.out.print(" "+c);
		a=b;
		b=c;
		fibonacii(i-1);
		}
		
	}

}
