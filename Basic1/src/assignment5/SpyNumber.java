//spy number
package assignment5;

public class SpyNumber {

	public static void main(String[] args) {
	//number whose sum and product of all digits are equal is called a spy number.
    int n=1124,sum=0,product=1;
    while(n>0)
    {
    	int last_digit=n%10;
    	sum+=last_digit;
    	product*=last_digit;
    	n=n/10;
    }
    if(sum==product)
    {
    	System.out.println("The given number is spy number");
    }
    else {
    	System.out.println("The given number is not a spy number");
    }
	}

}
