//palindrome number
package assignment5;

public class Palindrome {

	public static void main(String[] args) {
		int n=121,rev=0,temp=0;
		temp=n;
		while(n>0)
		{
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(temp==rev)
		{
			System.out.println(temp+ " is a palindrome number");
		}
		else {
		    System.out.println(temp+ " is not a palindrome number");
		}

	}

}
