package oops;

//here we are using co-variant type concept in overriding
//here parent class method's return type should be parent class of child class methods return type
 class Test1  {
	
	
	Object show() 
	{
		System.out.println("1");
		return null;
	}
}
public class Overriding_covariant extends Test1
{

	String show() 
	{
		super.show();
		System.out.println("2");
		return null;

	}
	
	public static void main(String[] args) 
	{
		Overriding_covariant o = new Overriding_covariant();
		o.show();
//		Test1 t = new Test1();
//		t.show();
    }

}
