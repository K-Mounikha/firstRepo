//Write a program to input angles of a triangle and check whether triangle is valid or not
package assignment3;

public class Triangle_valid {

	public static void main(String[] args) {
	  int angle1 = 60;
	  int angle2 = 60; 
	  int angle3 = 70; 
	  int total=angle1+angle2+angle3;
	  if(total==180 && angle1>0 && angle2>0 && angle3>0) {
		  System.out.println("Triangle is valid");
	  }
	  else {
		  System.out.println("Triangle is not valid");
	  }
	}

}
