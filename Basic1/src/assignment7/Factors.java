/*
  63.  Factor a number or algebraic expression that divides another number or expression evenly—i.e., with no 
 remainder. For example, 3 and 6 are factors of 12 because 12 ÷ 3 = 4 exactly and 12 ÷ 6 = 2 exactly. The 
 other factors of 12 are 1, 2, 4, and 12. Factors of 12: 1, 2, 3, 4, 6, 8, 12.
 */
package assignment7;
import java.util.Scanner;
public class Factors {
	public static void factors(int num)
	{
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
	factors(num);
	

	}

}
