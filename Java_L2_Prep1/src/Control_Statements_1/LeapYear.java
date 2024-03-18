package Control_Statements_1;

public class LeapYear {

	public static void main(String[] args) {
		int year = 2024;
		if(year % 400 == 0 || (year % 4 == 0 && year % 100 !=0)) {
			System.out.println("it is a leap year");
		}

		else {
			System.out.println("it is not a leap year");
		}
	}

}


// condition 1 - year % 4 ==0 and year % 100 !=0
// condition 2 - year % 400 == 0