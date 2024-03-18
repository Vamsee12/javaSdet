package Control_Statements_1;

public class GreaterOfThree {
	public static void main(String[] args) {
		float a=10.35f;
		float b=5.75f;
		float c=12.52f;
		if(a>b && a>c)
		{
			System.out.println("The greaterNo is : "+a);
		}
		else if(b>a && b>c) {
			System.out.println("The greaterNo is : "+b);
		}
		else
		{
			System.out.println("The greaterNo is : "+c);
		}
	}

}
//       if(a>b){

 //        if(a>c) {
//              SOP("a is greater"+a);
//                 }
//         else 
//             { sop("c is greater"+c); 
//             }

 //               }

//      else if (b>c){
//        sop("b is greater"+b);
//                   }

//      else {
//      sop("c is greater"+c);
//           }
