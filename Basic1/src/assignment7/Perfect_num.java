/*
  68.  A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number 
 itself. For instance, 6 has divisors 1, 2 and 3, and 1 + 2 + 3 = 6, so 6 is a perfect number.
 */
package assignment7;

public class Perfect_num {

	public static void main(String[] args) {
		int n=6,sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0) 
			{
				sum+=i;
			}
		}
		if(n==sum) {
			System.out.println(n+ " is perfect number");
			}
		else {
			System.out.println(n+ " is not a  perfect number");
			
			}

	}

}
