//Write a program to check whether a number is divisible by 5 and 11 or not?
package assignment3;

public class Divisibility {

	public static void main(String[] args) {
	 int num=55;
	 if(num%5==0) {
	       if(num%11==0) {
		   System.out.println("number is divisible by 5 and  11");
	       }
	       else {
			   System.out.println("number is not divisible by 5 and 11");
		 }
	  }
	  else {
		   System.out.println("number is not divisible by 5 and 11");
	 }
	}

}
