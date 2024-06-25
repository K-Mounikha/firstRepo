/*
  A neon number is a number where the sum of digits of the square of the number is equal to the number. For 
 example, if the input number is 9, its square is 9*9 = 81 and the sum of the digits is 9. i.e., 9 is a neon number.
 */
package assignment7;

public class Neon_number {

	public static void main(String[] args) {
		int n=9,sum=0;
		int square=n*n;
		while(square!=0)
		{
			int last_digit=square%10;
			sum+=last_digit;
			square=square/10;
		}
		if(n==sum)
		{
			System.out.println(n+" is a neon number");
		}
		else {
			System.out.println(n+ "  is not a neon number");
		}

	}

}
