//14.Create an abstract class for different types of animals, with subclasses for different species like dog and cat.
package abstraction;
abstract class Animal
{
	private String name;
    private int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public abstract void makeSound();
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Dog extends Animal{
	public Dog(String name, int age) {
     super(name, age);
	}
	public void makeSound() {
     System.out.println("Woof! Woof!");
    }
    public void displayInfo() {
     super.displayInfo();
     System.out.println("Species: Dog");
 }
}
class Cat extends Animal {

    public Cat(String name, int age) {
     super(name, age);
 }
    public void makeSound() {
     System.out.println("Meow! Meow!");
 }
 public void displayInfo() {
     super.displayInfo();
     System.out.println("Species: Cat");
 }
}
public class AnimalsAbstract {

	public static void main(String[] args) {
		Animal dog = new Dog("Buddy", 3);
        Animal cat = new Cat("Whiskers", 2);
        System.out.println("--- Dog ---");
        dog.displayInfo();
        dog.makeSound();
        System.out.println();

        System.out.println("--- Cat ---");
        cat.displayInfo();
        cat.makeSound();

	}

}
