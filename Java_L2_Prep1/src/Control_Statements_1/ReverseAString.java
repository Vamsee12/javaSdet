package Control_Statements_1;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name for which you want to reverse it :");
		String name = sc.next();
		String rev="";
		int len = name.length();
		for(int i=len-1;i>=0;i--) {                 // we take len-1 because index starts from 0
			rev = rev + name.charAt(i);
		}
		
		System.out.println(rev);

	}

}
