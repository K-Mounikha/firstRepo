//Buzz number
package assignment7;
import java.util.Scanner;
public class Buzz_num {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
	if(num%10==7 || num%7==0)
	{
		System.out.println("Buzz number");
	}
	else
	{
		System.out.println("not a buzz number");
	}

	}

}
