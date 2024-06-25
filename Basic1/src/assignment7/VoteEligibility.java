//Write a Java Program to determine if a person is eligible to vote based on their age and nationality. 
package assignment7;
import java.util.Scanner;
public class VoteEligibility {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your nationality:");
		String nationality= sc.nextLine();
		System.out.println("enter your age:");
		int age=sc.nextInt();
		if (nationality.equals("indian") && age>=18 ) {
			System.out.println("eligible to vote");
		}
		else {
			System.out.println("not eligible to vote");
		}
    
	}

}
