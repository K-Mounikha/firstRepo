//56. Write a Java program to display the square of the given number up to an integer.
package assignment7;
import java.util.Scanner;
public class Square_of_num {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int square=num*num;
		System.out.println("the square of given number is:"+square);

	}

}
