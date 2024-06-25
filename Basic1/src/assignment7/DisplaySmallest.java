// 75.  Write a program to enter the numbers till the user wants and at the end the program should display the smallest number entered.
package assignment7;
import java.util.Scanner;
public class DisplaySmallest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println( "Enter the number:");
		int smallest=sc.nextInt();
		String choice;
		
		do {
			System.out.println("enter the number:");
			int num=sc.nextInt();
			if (num<smallest) {
				smallest=num;
			}
			else
			{
				System.out.println("enter the positive number");
			}
			System.out.println("do you want another number? (yes/no):");
			choice=sc.next();
		}
		while(choice.equals("yes"));
		System.out.println("The smallest number is:"+smallest);

	}

}
