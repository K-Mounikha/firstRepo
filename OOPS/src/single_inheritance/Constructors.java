/*
 6.Single Inheritance with Constructor 
 a.Create a base class Person with parameterized constructor and a method displayInfo () The derived class 
 student inherits from the Person class and uses the super keyword to call the constructor of the base class.
 It also adds its own field rollNumber and a method displayStudentInfo ().
 The program demonstrates creating an instance of student and calling methods from both the base and derived classes. 
 */
package single_inheritance;
class Person{
	String name;
	int age;
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void displayInfo() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}
class Student extends Person{
	int rollNo;
	public Student(String name,int age,int rollNo)
	{
		super(name,age);
		this.rollNo=rollNo;
		
	}
	public void displayStudentInfo()
	{
		displayInfo();
		System.out.println("Roll Number: "+rollNo);
	}
}
public class Constructors {

	public static void main(String[] args) {
	Student s=new Student("mouni",20,884);
	s.displayInfo();
	s.displayStudentInfo();

	}

}
