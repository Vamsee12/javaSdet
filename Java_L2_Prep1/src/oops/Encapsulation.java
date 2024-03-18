package oops;

//encapsulation example
//1st step is creating private variables
//2nd step is creating public setter and getter methods and binding them with variables
class Test2
{
	private int empId;
	
	public void set(int empId1) 
	{
		empId = empId1;
	}
	
	public int get() 
	{
		return empId;
	}
}
public class Encapsulation {
	
	public static void main(String[] args)
	{
		Test2 t = new Test2();
		t.set(105);
		System.out.println(t.get());  // here we can access empId value only through method as variable is private
		//System.out.println(t.empId);
	}

}
