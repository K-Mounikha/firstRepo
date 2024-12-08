package multilevel_inheritance;
class Person
{
	String name;
	Person(String name)
	{
		this.name=name;
	}
	public void displayInfo()
	{
		System.out.println("Name: "+name);
	}
}
class Employe extends Person
{
	double salary;
	Employe(String name, double salary)
	{
		super(name);
		this.salary=salary;
	}
	public void displaySalary()
	{
		System.out.println("Salary: "+salary);
	}
}
class Manager extends Employe
{
	String dept;
	Manager(String name,double salary,String dept)
	{
		super(name,salary);
		this.dept=dept;
	}
	public void displayDepartment() 
	{
		System.out.println("Department: "+dept);
	}
}
public class MultiLevel_person {

	public static void main(String[] args) {
	Manager m=new Manager("A",50000,"CSE");
	m.displayInfo();
	m.displaySalary();
	m.displayDepartment();

	}

}
