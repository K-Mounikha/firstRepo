//Write a program to add 8 to the number 2345 and then divide it by 3. Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. Display the final result.
package assignment1;

public class Number {

	public static void main(String[] args) {
		int a=8,b=2345,c=0,d=0,e=0;
		 c=a+b;
		 d=c/3;
         e=(d%5)*5;
		System.out.println("result:"+e);//20


	}

}
