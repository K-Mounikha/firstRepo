//Neon Number
package assignment5;

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
