//33. Write a program to calculate the sum of positive numbers entered by the user.The program stops taking input when a negative number is entered. 
package assignment7;
import java.util.Scanner;
public class Sum_positive_nums {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int sum=0;
	while(true)
	{
		System.out.println("enter the numbers: ");
		int num=s.nextInt();
		if(num<0) {
			break;
		}
		sum+=num;
	}
	System.out.println("sum: "+sum);
	

	}

}
