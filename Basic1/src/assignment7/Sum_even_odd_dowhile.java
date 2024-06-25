//74. Write a java program to print sum of all even and odd numbers using do while loop
package assignment7;
import java.util.Scanner;
public class Sum_even_odd_dowhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int even_sum=0;
		int odd_sum=0;
		String choice;
		
		do {
			System.out.println("Enter the number:");
			int num=sc.nextInt();
			if (num%2==0) {
				even_sum+=num;
			}
			else {
				odd_sum+=num;
			}
			System.out.println("do you want another number? (yes/no):");
			choice=sc.next();
		}while(choice.equals("yes"));
		System.out.println("sum of even numbers:"+even_sum);
		System.out.println("sum of odd numbers:"+odd_sum);
		sc.close();
	}

	}


