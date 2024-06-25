//Given three values representing the lengths of the three sides of a triangle, determine whether the triangle is regular (all three sides are equal), symmetric (two sides are equal), or irregular (no two sides are equal). 
package assignment7;
import java.util.Scanner;
public class Triangle_regular_irregular {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the side1");
    int s1=sc.nextInt();
    System.out.println("enter the side2");
    int s2=sc.nextInt();
    System.out.println("enter the side3");
    int s3=sc.nextInt();
    if(s1==s2 &&s2==s3)
    {
    	System.out.println("Regular triangle");
    }
	else if(s1==s2||s2==s3||s3==s1) {
		System.out.println("symmetric traingle");
	}
	else {
		System.out.println("Irregular triangle");
	}
	}

}
