/*
 9.Create three classes: Vehicle, Car, and SportsCar.The Vehicle class is the base class that has a method start().
 The Car class is the child class that inherits from Vehicle and adds a new method drive().
 The SportsCar class is the grandchild class that inherits from Car and adds a new method accelerate(). 
 When we create an instance of the SportsCar class and call its methods, it can access methods from all three levels of the inheritance hierarchy.
 */
package multilevel_inheritance;
class Vehicle
{
	public void starts()
	{
		System.out.println("vehicle starts");
	}
}
class Car extends Vehicle
{
	public void drive()
	{
		System.out.println("car is driving");
	}
}
class SportsCar extends Car
{
	public void accelerate()
	{
		System.out.println("sportsCar is accelerating");
	}
}
public class MultiLevel_vehicle {

	public static void main(String[] args) {
		SportsCar s=new SportsCar();
		s.starts();
		s.drive();
		s.accelerate();

	}

}
