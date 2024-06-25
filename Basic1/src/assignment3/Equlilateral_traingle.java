//Write a program to check whether the triangle is equilateral, isosceles or scalene triangle?
package assignment3;

public class Equlilateral_traingle {

	public static void main(String[] args) {
	int s1=10,s2=10,s3=10;
	if(s1==s2 && s1==s3) {
		System.out.println("equilateral traingle");
	}
	else if(s1==s2||s2==s3||s3==s1) {
		System.out.println("isoscles traingle");
	}
	else {
		System.out.println("scalene triangle");
	}
	}

}
