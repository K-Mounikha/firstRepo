//  program to find maximum between two numbers (inputs from scanner class).
package assignment7;

import java.util.Scanner;

public class Max_two_nums {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number1: ");
	    int num1=sc.nextInt();
	    System.out.println("Enter the number2: ");
	    int num2=sc.nextInt();
	    if(num1>num2)
	    {
	    	System.out.println(num1+ "is greater number");
	    }
	    else
	    {
	    	System.out.println(num2+ " is greater number");
	    }
	}

}
