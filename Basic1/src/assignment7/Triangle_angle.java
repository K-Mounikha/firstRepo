// Write a program to check whether a triangle can be formed by the given value for the angles.(3 angles sum should be 180 , ); 
package assignment7;
import java.util.Scanner;
public class Triangle_angle {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the angle1");
    int angle1=sc.nextInt();
    System.out.println("enter the angle2");
    int angle2=sc.nextInt();
    System.out.println("enter the angle3");
    int angle3=sc.nextInt();
    int sum=angle1+angle2+angle3;
    if(sum==180)
    {
    	System.out.println("Triangle can be formed");
    }
    else
    {
    	System.out.println("Triangle can not be formed");
    }

	}

}
