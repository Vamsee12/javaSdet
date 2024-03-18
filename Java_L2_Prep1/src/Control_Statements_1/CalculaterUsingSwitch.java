package Control_Statements_1;

import java.util.Scanner;

public class CalculaterUsingSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for num1: ");
		float num1 = sc.nextFloat();
		System.out.println("Enter the value for num2: ");
		float num2 = sc.nextFloat();
		System.out.println("Enter the symbol do perform operations like +,-,*,/ ");
		String symbol = sc.next();
		float result;
		
		switch(symbol) {
		
		case "+": result = num1+num2;
		System.out.println(result);
		break;
		
		case "-": result = num1-num2;
		System.out.println(result);
		break;
		
		case "*": result = num1*num2;
		System.out.println(result);
		break;
		
		case "/": result = num1/num2;
		System.out.println(result);
		break;
		
		default: result = num1%num2;
		System.out.println(result);
		break;
		}
		
	}

}
