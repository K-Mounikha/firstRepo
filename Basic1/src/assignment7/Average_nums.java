// 78. Write a java program to print the average of numbers entered by the user. 
package assignment7;
import java.util.Scanner;
public class Average_nums {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  any three numbers :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int total=a+b+c;
		int average=(total/3);
		System.out.println("the average of three numbers:"+average);
	}

}
