//52.Write a java program to print sum of all even and odd numbers.
package assignment7;
import java.util.Scanner;
public class Sum_even_odd_nums {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int n=sc.nextInt();
	int sum_even=0;
	int sum_odd=0;
	for(int i=1;i<=n;i++)
	{
		if(i%2==0)
		{
			sum_even+=i;
		}
		else
		{
			sum_odd+=i;
		}
	}
	System.out.println("sum of n even numbers: "+sum_even);
	System.out.println("sum of n odd numbers: "+sum_odd);

	}

}
