// Write a program to check whether a number is even or odd. 
package assignment7;
import java.util.Scanner;
public class Even_odd {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
	if(num%2==0)
	{
		System.out.println(num+ " is even number");
		 
	}
	else
	{
		System.out.println(num+ " is odd number");
	}

	}

}
