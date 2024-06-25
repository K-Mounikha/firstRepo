//19.Write a Java program to calculate the total number of days in a given month. 
package assignment7;
import java.util.Scanner;
public class Days_in_month {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter month name:");
		String month= sc.nextLine();
		int days = 0;
		switch(month){
		case "january":
			days=31;
			break;
		case "february":
			System.out.println("28 days in non-leap and 29 days in leap year.");
			break;
		case "march":
			days=31;
			break;
		case "april":
			days=30;
			break;
		case "may":
			days=31;
			break;
		case "june":
			days=30;
			break;
		case "july":
			days=31;
			break;
		case "august":
			days=31;
			break;
		case "september":
			days=30;
			break;
		case "october":
			days=31;
			break;
		case "november":
			days=30;
			break;
		case "december":
			days=31;
			break;
		default:
			System.out.println(month+" doesn't exist");
		}
		System.out.println("Total number of days in the given month: " + days);
	}

}
