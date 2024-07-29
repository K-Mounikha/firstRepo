//1. Create a class hierarchy for different types of animals using inheritance.
package inheritance;
class Animal {
	String name;
	int age;
	Animal(String name,int age){
		this.name=name;
		this.age = age;
    }
	public void sleep(){
		System.out.println(name + " is sleeping");
    }
}
class Mammal extends Animal{
	boolean hasFur;
	Mammal(String name,int age,boolean hasFur) {
		super(name,age);
		this.hasFur=hasFur;
		}
    }
class Dog extends Mammal{
	String breed;
	Dog(String name,int age,boolean hasFur,String breed) {
		super(name,age,hasFur);
		this.breed=breed;
    }
    public void eat() {
       System.out.println(name + " the dog is eating pedigree");
    }
    public void bark() {
       System.out.println(name + " is barking");
    }
}
public class AnimalHierarchy {
public static void main(String[] args) {
   Dog dog = new Dog("Buddy", 3, true, "Labrador");
   dog.eat();
   dog.bark();
   dog.sleep();
 }
}
