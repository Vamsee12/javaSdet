package oops;

public class ObjectInitialization {

	int age;
	String name;
	
	void test1(int a,String b) 
	{
		age=a;
		name=b;
	}
	void test2() 
	{
		System.out.println(age+ " "+ name);
	}
	public static void main(String[] args) {
		 
		ObjectInitialization ob = new ObjectInitialization();
		ob.test1(7, "rocky");
		ob.test2();

	}

}
