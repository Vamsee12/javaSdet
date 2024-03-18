package star_patterns;

//1st pattern 
//       c1c2c3c4
// row1  *
// row2  * *
// row3  * * *
// row4  * * * *

//2nd pattern

//  * * * *
//  * * *
//  * *
//  *
public class First_Star_Pattern {

	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1;i<=4;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}

}
