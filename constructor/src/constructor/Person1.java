/*
  2.Write a Java class called Employee that extends Person and adds a private field for
 salary. Create a constructor that takes in a name, age, and salary as parameters and
 initializes the fields using the super keyword to call the Person constructor. Also,
 create a method called displaySalary that prints out the employee's salary
 */
package constructor;

public class Person1 {
	private String name;
    private int age;
    Person1(String name, int age) {
        this.name=name;
        this.age=age;
    }
    public void introduce() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        Employee emp = new Employee("A", 20, 50000);
        emp.displaySalary();
	}
}
class Employee extends Person1 {
    private double salary;
    public Employee(String name,int age,double salary) {
        super(name, age); 
        this.salary = salary;
    }
    public void displaySalary() {
        System.out.println("Salary: " + salary);
    }
    
}
