//46. Write a Java program to create a simple calculator. 
package assignment7;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number1");
		int a=sc.nextInt();
		System.out.println("enter the number2");
		int b=sc.nextInt();
		System.out.println("enter the operator(+,-,*,/,%)");
		char ch=sc.next().charAt(0);
		switch(ch)
		{
		case '+':
			System.out.println("Addition: "+(a+b));
			break;
		case '-':
			System.out.println("Subtraction: "+(a-b));
			break;
		case '*':
			System.out.println("Multiplication: "+(a*b));
			break;
		case '/':
			System.out.println("Division: "+(a/b));
			break;
		case '%':
			System.out.println("Modulus: "+(a%b));
			break;
		default:
			System.out.println("Invalid operator");
		}
	}
}

	
