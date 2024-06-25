//47.  Write a program to find the factorial value of any number without using a loop. 
package assignment7;
import java.util.Scanner;
public class Factorial {
	public static long factorial_num(int n)
	{
		if(n==0||n==1)
		{
			return n;
		}
		return n* factorial_num(n-1);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int n=sc.nextInt();
		long result=factorial_num(n);
		System.out.println("The factorial of "+n+ " is " +result);

	}

}
