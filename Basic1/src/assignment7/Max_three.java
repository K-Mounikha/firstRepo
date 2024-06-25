//Write a program to find the maximum between three numbers.(inputs from scanner class).
package assignment7;

import java.util.Scanner;

public class Max_three {
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number1: ");
	    int num1=sc.nextInt();
	    System.out.println("Enter the number2: ");
	    int num2=sc.nextInt();
	    System.out.println("Enter the number3: ");
	    int num3=sc.nextInt();
	    if(num1>num2 &&num1>num3)
	    {
	    	System.out.println(num1+ " is greatest number");
	    }
	    else if(num2>num3)
	    {
	    	System.out.println(num2+ " is greatest number");
	    }
	    else
	    {
	    	System.out.println(num3+ " is greatest number");
	    }
	}

}
