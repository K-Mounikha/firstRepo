/*
  1.Write a Java class called Person with private fields for name and age. Create a
 constructor that takes in a name and age as parameters and initializes the fields.
 Also, create a method called introduce that prints out a message introducing the
 person with their name and age.
 */
package constructor;

public class Person {
	private String name;
	private int age;
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void introduce()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}

	public static void main(String[] args) {
	Person p=new Person("A",20);
	p.introduce();

	}

}
