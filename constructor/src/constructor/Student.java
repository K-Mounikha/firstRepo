/*
 4.Write a Java class called Student with private fields for name, age, and GPA.
 Create two constructors- one that takes in a name, age, and GPA as parameters and
 initializes the fields, and another that takes in just a name and age as parameters
 and sets the GPA to 0.0. Also, create a method called displayGPA that prints out the
 student's GPA
 */
package constructor;

public class Student {
	private String name;
	private int age;
	private double GPA;
	Student(String name,int age,double GPA)
	{
		this.name=name;
		this.age=age;
		this.GPA=GPA;
	}
	Student(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void display()
	{
		System.out.println("Name:"+name+" "+"Age:"+age+" "+"GPA:"+GPA);
	}
	public void displayGPA()
	{
		System.out.println("GPA: "+GPA);
	}
	public static void main(String[] args) {
	Student s=new Student("A",20,8.9);
	Student s1=new Student("A",20);
	s1.display();
    s.displayGPA();
	}

}
