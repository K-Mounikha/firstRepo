//Employees Year of Service Salary Bonus in Java?
package assignment3;

public class Employee_bonus {

	public static void main(String[] args) {
	int salary=50000;
	int years_of_service=5;
	double bonus=0;
	if(years_of_service>=5) {
		bonus=salary*0.1;
	}
	else if(years_of_service>=3) {
		bonus=salary*0.05;
	}
	else {
		bonus=0;
	}
    double total_salary = salary + bonus;
    System.out.println("employess salary: "+salary);
    System.out.println("employess bonus: "+bonus);
    System.out.println("employess total salary including bonus: "+total_salary);
    

	}

}
