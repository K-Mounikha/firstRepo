//Write a program to check whether a number is divisible by 4 and 100 or not. 
package assignment7;
import java.util.Scanner;
public class Divisibility_4_100 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
	if(num%4==0 && num%100==0)
	{
	   System.out.println(num+ " is divisible by 4 and 100");
	}
	else
	{
		System.out.println(num+ " is not divisible by 4 and 100");
	}
	}

}
