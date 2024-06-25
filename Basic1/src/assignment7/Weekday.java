//21. Write a Java Program to display the name of a day of the week based on the given number(1-7).
package assignment7;
import java.util.Scanner;
public class Weekday {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter day number:");
		int week_num= sc.nextInt();
		String week_day="";
		if(week_num==1) {
			week_day="sunday";
		}
		else if(week_num==2) {
			week_day="monday";
		}
		else if(week_num==3) {
			week_day="tuesday";
		}
		else if(week_num==4) {
			week_day="wednesday";
		}
		else if(week_num==5) {
			week_day="thursday";
		}
		else if(week_num==6) {
			week_day="friday";
		}
		else if(week_num==7) {
			week_day="saturday";
		}
		else {
			System.out.println("week day should be 1 to 7");
		}
		System.out.println("weekday:" +week_day);

	}

}
