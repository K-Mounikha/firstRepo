//2.Program to calculate salary of an employee using single inheritance in java.
package single_inheritance;
import java.util.Scanner;
class Employe
{
	int basic_sal;
	int pf;
	int esi;
	public void getSalary()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the basic salary: ");
		basic_sal=sc.nextInt();
		System.out.println("enter the pf: ");
		pf=sc.nextInt();
		System.out.println("enter the esi: ");
		esi=sc.nextInt();
	}
}
class TotalSalary extends Employe{
	public void calculate_sal() {
		int total_sal=basic_sal+pf+esi;
		System.out.println("Total salary of an employee: "+total_sal);
	}
}

public class Salary {

	public static void main(String[] args) {
	TotalSalary t=new TotalSalary();
	t.getSalary();
	t.calculate_sal();

	}

}
