//Write a program to check whether a year is leap year or not?
package assignment3;

public class Leap_year {

	public static void main(String[] args) {
	int year=2003;
	if(year%4==0 && year%100!=0) {
		System.out.println("leap year");
	}
	else {
		System.out.println("not a leap year");
	}

	}

}
