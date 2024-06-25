// 73.  Print Sum of positive numbers using do while loop. 
package assignment7;
import java.util.Scanner;
public class Sum_of_positive_num_do_while {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String choice;
	int sum=0;
	do {
		System.out.println("enter the number");
		int num=sc.nextInt();
		if(num>0)
		{
			sum+=num;
		}
		else
		{
			System.out.println("enter the positive numbers");
		}
		System.out.println("do you want to continue(yes/no)");
	    choice=sc.next();
		
	}while(choice.equals("yes"));
	System.out.println("sum of the positive numbers: "+sum);

	}

}
