//15.  Write a Java program to display the cube of the given number up to an integer. 
package assignment7;
import java.util.Scanner;
public class Cube_of_num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number cube:");
		int num= sc.nextInt();
		System.out.println("cube of the given number: "+(num*num*num));


	}

}
