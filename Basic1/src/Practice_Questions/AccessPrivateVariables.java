package Practice_Questions;

public class AccessPrivateVariables {

	public static void main(String[] args) {
    Private_var p1 = new Private_var(101, "A");
        
        // Accessing private variables via getter methods
        int empId = p1.getid();
        String empName = p1.getName();
        
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);

	}

}
