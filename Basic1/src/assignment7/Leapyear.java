//Check if a year is a leap year
package assignment7;
import java.util.Scanner;
public class Leapyear {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the year");
    int year=sc.nextInt();
    if(year%4==0 && year%100!=0)
    {
    	System.out.println("leap year");
    }
    else
    {
    	System.out.println("Not a leap year");
    }
	}

}
