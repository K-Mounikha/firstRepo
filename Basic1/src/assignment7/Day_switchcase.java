//40.Write a program that prompts the user to enter a number from 1 to 7 and display the corresponding day of the week using a Switch Statement.
package assignment7;
import java.util.Scanner;
public class Day_switchcase {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number(1 to 7)");
	int num=sc.nextInt();
	switch(num)
	{
	case 1:
		System.out.println("Monday");
		break;
	case 2:
		System.out.println("Tuesday");
		break;
	case 3:
		System.out.println("Wednesday");
		break;
	case 4:
		System.out.println("Thursday");
		break;
	case 5:
		System.out.println("Friday");
		break;
	case 6:
		System.out.println("Saturday");
		break;
	case 7:
		System.out.println("Sunday");
		break;
	default:
		System.out.println("Invalid number");
	}
	}

}
