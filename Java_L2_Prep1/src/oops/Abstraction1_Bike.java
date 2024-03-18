package oops;

abstract class Vehicle
{
	abstract void start();
}

class Car extends Vehicle
{
	void start()
	{
		System.out.println("Car has four tyres");
	}
}
public class Abstraction1_Bike extends Vehicle {
	
	void start()
	{
		System.out.println("bike has two tyres");
	}
	public static void main(String[] args)
	{
		Abstraction1_Bike ab = new Abstraction1_Bike();
		ab.start();
		
		Car c = new Car();                                 // here i did not inherit car class but still i can create the object of car here
		c.start();
		
	}

}
