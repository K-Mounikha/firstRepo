//55. Write a program in Java to input 5 numbers from the keyboard and find their sum and average. 
package assignment7;
import java.util.Scanner;
public class Input_5_nums_sum_avg {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the numbers");
	double sum=0;
	double average=0;
	for(int i=1;i<=5;i++)
	{
		int num=sc.nextInt();
		sum+=num;
	}
	average=sum/5;
	System.out.println("sum of 5 numbers: "+sum);
	System.out.println("Average of 5 numbers: "+average);
	}

}
