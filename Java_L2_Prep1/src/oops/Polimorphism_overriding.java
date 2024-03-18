package oops;

class Test{
	void show() 
	{
		System.out.println("1");
	}
}
public class Polimorphism_overriding extends Test {

	void show() 
	{
		System.out.println("2");
	}
	public static void main(String[] args) {
		
		Polimorphism_overriding p = new Polimorphism_overriding();
		p.show();
		
		Test t = new Test();
		t.show();

	}

}
