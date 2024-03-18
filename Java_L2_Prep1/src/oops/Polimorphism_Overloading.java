package oops;

public class Polimorphism_Overloading {

	
	void show(int a,String b)
	{
		System.out.println("vmc");
	}
	
	void show(String a, int b)
	{
		System.out.println("maahi");
	}
	public static void main(String[] args) {
		
		Polimorphism_Overloading p = new Polimorphism_Overloading();
		p.show("call", 3);

	}

}
