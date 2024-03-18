package Control_Statements_1;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number to check palindrome or not: ");
		int num = sc.nextInt();
		int rev=0,rem,palindrome;
		
		if(num!=0) {
			rem=num%10;
			rev =rev*10+rem;
			num=num/10;
		}
		
		
		
		if(rev==num) {
			System.out.println("Given number is a palindrome");
		}
		else {
			System.out.println("Given number is not a palindrome");
		}
		
		

	}

}
