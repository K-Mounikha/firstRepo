//Determine the grade based on a student's score. 
package assignment7;
import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter 3 subjects marks:");
		int sub1= sc.nextInt();
		int sub2= sc.nextInt();
		int sub3= sc.nextInt();
		char grade=' ';
		int total= sub1+ sub2+ sub3;
		int percentage= (total/3);
		if (percentage>=90) {
			grade='A';
		}
		else if (percentage>=80) {
			grade='B';
		}
		else if (percentage>=70) {
			grade='C';
		}
		else if (percentage>=60) {
			grade='D';
		}
		else {
			System.out.println("fail");
		}
		System.out.println(percentage+"% and grade:"+ grade);

	}

}
