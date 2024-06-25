// 67.A palindromic number is a number that remains the same when its digits are reversed. Like 16461. 
package assignment7;

public class Palindrome_num { 

	public static void main(String[] args) {
		int n=16461,rev=0,temp=0;
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
