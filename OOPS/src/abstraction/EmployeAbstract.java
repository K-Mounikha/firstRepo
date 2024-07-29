//Implement an abstract class for different types of employees, with subclasses for different roles like manager and intern.
package abstraction;
abstract class Employee {
    private String name;
    private int age;
    private String role;
    public Employee(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }
    public abstract void work();//abstract method
    public void displayInfo() {//common method
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Role: " + role);
    }
}
class Manager extends Employee {
    private String department;
    public Manager(String name, int age, String department) {
        super(name, age, "Manager");
        this.department = department;
    }

    public void work() {
        System.out.println("Managing the " + department + " department.");
    }
}
// Subclass representing an Intern
class Intern extends Employee {
    private String mentor;

    public Intern(String name, int age, String mentor) {
        super(name, age, "Intern");
        this.mentor = mentor;
    }
    public void work() {
        System.out.println("Learning from " + mentor + " as an intern.");
    }
}

public class EmployeAbstract {

	public static void main(String[] args) {
        Employee manager = new Manager("A",21,"CSE");
        Employee intern = new Intern("B",20,"Senior Manager");
        System.out.println("Manager Details:");
        manager.displayInfo();
        manager.work();
        System.out.println();
        System.out.println("Intern Details:");
        intern.displayInfo();
        intern.work();


	}

}
