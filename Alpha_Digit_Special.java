//Write a program to input any character and check whether it is alphabet, digit or special character?
package assignment3;
import java.util.Scanner;
public class Alpha_Digit_Special {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the Value");
	char ch =sc.next().charAt(0);
	if(ch >='a' && ch<='z' || ch>='A' && ch<='Z') {
		System.out.println("Alphabet");
	}
	else if(ch>='0' && ch<='9') {
		System.out.println("Number");
	}
	else {
		System.out.println("Special");
	}
	}

}
