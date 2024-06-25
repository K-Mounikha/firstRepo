//65. If a number=1234, then 1*2*3*4, Multiply of digit=24, Multiply of Digit Program in Java.
package assignment7;

public class Multiply_of_digits {

	public static void main(String[] args) {
		int num=1234;
		int product=1;
		while(num>0) {
			int digit=num%10;
			product*=digit;
			num/=10;
		}
		System.out.println("Product of digits: "+product);
	}

}
