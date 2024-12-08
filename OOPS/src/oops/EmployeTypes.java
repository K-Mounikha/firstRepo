/*22.Implement an abstract class for different types of employees, with subclasses
 for different departments like HR and IT, and private variables for salary and job title.
 */
package oops;
abstract class Employee {
    private double salary;
    private String jobTitle;
    private String name;
    private int employeeId;

    public Employee(String name, int employeeId, double salary, String jobTitle) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public abstract void performDuties();

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
    }
}
class HR extends Employee {
    public HR(String name, int employeeId, double salary, String jobTitle) {
        super(name, employeeId, salary, jobTitle);
    }
    public void performDuties() {
        System.out.println("Performing HR duties like recruiting and employee relations.");
    }
}
class IT extends Employee {
    public IT(String name, int employeeId, double salary, String jobTitle) {
        super(name, employeeId, salary, jobTitle);
    }
    public void performDuties() {
        System.out.println("Performing IT duties like system administration and technical support.");
    }
}
public class EmployeTypes {

	public static void main(String[] args) {
		 Employee hrEmployee = new HR("A", 101, 60000, "HR Manager");
	        Employee itEmployee = new IT("B", 102, 75000, "IT Specialist");

	        System.out.println("HR Employee Info:");
	        hrEmployee.displayInfo();
	        hrEmployee.performDuties();
	        
	        System.out.println("\nIT Employee Info:");
	        itEmployee.displayInfo();
	        itEmployee.performDuties();

	}

}
