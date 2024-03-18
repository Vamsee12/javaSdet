package Control_Statements_1;

import java.util.Scanner;

public class ScaneerInputExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		String name = sc.next();
		
		System.out.println("Enter your gender : ");
		char gender = sc.next().charAt(0);
		
		System.out.println("Enter your Age : ");
		int age = sc.nextInt();
		
		System.out.println("Enter your phone number : ");
        long ph_no = sc.nextLong();
        
        System.out.println("name: "+name +'\n'+"gender: "+gender+'\n'+"age: "+ age+'\n'+"ph num: "+ph_no);

	}

}
