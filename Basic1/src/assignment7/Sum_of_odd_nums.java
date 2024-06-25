// 48.Write a Java program that displays the sum of n odd natural numbers
package assignment7;
import java.util.Scanner;
public class Sum_of_odd_nums {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of odd numbers");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			int odd_nums=2*i-1;
			sum+=odd_nums;
		}
		System.out.println("sum of n odd natural numbers: "+ sum);
		

	}

}
