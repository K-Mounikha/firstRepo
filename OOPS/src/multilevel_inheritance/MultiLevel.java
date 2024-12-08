/*
8.Create three classes: Animal, Dog, and Labrador.The Animal class is the base class that has a method eat().
 The Dog class is the child class that inherits from Animal and adds a new method bark().
 The Labrador class is the grandchild class that inherits from Dog and adds a new method displayColor(). 
 When we create an instance of the Labrador class and call its methods, it can access all the methods from its base class and its parent
 */
package multilevel_inheritance;
class Animal
{
	public void eat()
	{
		System.out.println("Eating");
	}
}
class Dog extends Animal
{
	public void bark()
	{
		System.out.println("Barking");
	}
	
}
class Labrador extends Dog
{
	public void displayColour(String colour)
	{
		System.out.println("colour is: "+colour);
	}
}
public class MultiLevel {

	public static void main(String[] args) {
		Labrador l=new Labrador();
		l.eat();
		l.bark();
		l.displayColour("white");
	}

}
