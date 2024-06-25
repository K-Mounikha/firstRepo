//  Write a program to check whether a number is negative, positive or zero. 
package assignment7;

import java.util.Scanner;

public class Positive_negative_zero {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number: ");
	    int num=sc.nextInt();
	    if(num>0)
	    {
	    	System.out.println(num+ " is the positive number");
	    }
	    else if(num<0)
	    {
	    	System.out.println(num+ " is the negative number");
	    }
	    else
	    {
	    	System.out.println("zero");
	    }

	}

}
