// 69.  If a number=1234, then the reverse of the number is 4321. 
package assignment7;

public class Reverse_num {

	public static void main(String[] args) {
		int n=1234,rev=0;
		while(n>0)
		{
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
	    System.out.println("Reverse of the given number: "+rev);
		}
	}


