//37.Write a program that takes a grade as input (A, B, C, D, or F) and prints a corresponding message based on the grade using a Switch Statements.
package assignment7;
import java.util.Scanner;
public class Grade_switchcase {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the grade(A,B,C,D,E,F)");
	 char ch=sc.next().charAt(0);
	 switch(ch)
	 {
	 case 'A':
		 System.out.println("excellent");
		 break;
	 case 'B':
		 System.out.println("good");
		 break;
	 case 'C':
		 System.out.println("you did ok");
		 break;
	 case 'D':
		 System.out.println("you passed");
		 break;
	 case 'E':
		 System.out.println("you just passed");
		 break;
	 case 'F':
		 System.out.println("better luck next time");
		 break;
	default:
		System.out.println("Invalid character");
	 }
	

	}

}
