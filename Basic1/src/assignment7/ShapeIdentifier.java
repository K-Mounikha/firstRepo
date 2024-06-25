//41.Write a program that takes the number of sides of a shape as input and determine its name (e.g., triangle, square, pentagon) using a Switch Statements. 
package assignment7;
import java.util.Scanner;
public class ShapeIdentifier {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of sides");
	int num=sc.nextInt();
	switch(num)
	{
	case 3:
		System.out.println("The shape is a Triangle");
		break;
	case 4:
		System.out.println("The shape is a Square or Rectangle");
		break;
	case 5:
		System.out.println("The shape is a Pentagon");
		break;
	default:
		System.out.println("Invalid number");
	}

	}

}
