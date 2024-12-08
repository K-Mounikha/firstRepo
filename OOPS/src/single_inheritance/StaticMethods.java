/*
 7.Single Inheritance with Static methods 
 a.Create a base class MathUtility with a static method square () that calculates the square of an integer. 
 The derived class Calculator inherits from the MathUtilitly class adds a static methods cube () 
 that calculates the cube of an integer using the square () method from the base class. 
 The program demonstrates calling the static methods from the derived class.
 */
package single_inheritance;
import java.util.Scanner;
class MathUtility{
	public static int square(int num) {
        return num*num;
    }
}
class Calculator extends MathUtility {
    public static int cube(int num) {
        return num*square(num);
    }
}
public class StaticMethods {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an integer: ");
        int num=sc.nextInt();
        System.out.println("Square of " + num + " is: " + Calculator.square(num));
        System.out.println("Cube of " + num + " is: " +Calculator.cube(num));
    }
}