//39.Write a program that takes two numbers and an operator(+, -, *, /) as input and performs the corresponding arithmetic operation using a Switch Statements. 
package assignment7;
import java.util.Scanner;
public class Arithmetic_switchcase {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number1");
	int a=sc.nextInt();
	System.out.println("enter the number2");
	int b=sc.nextInt();
	System.out.println("enter the operator(+,-,*,/)");
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
	default:
		System.out.println("Invalid operator");
	
	}
	}

}
