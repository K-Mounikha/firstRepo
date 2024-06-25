//strong number
package assignment5;

public class Strong_number {

	public static void main(String[] args) {
	int n=145,sum=0;
	int temp=n;
	while(n>0)
	{
		int digit=n%10;
		int fact=1;
		for(int i=1;i<=digit;i++)
		{
			fact*=i;
		}
		sum+=fact;
		n=n/10;
	}
	if(sum==temp)
	{
		System.out.println(temp+ " is a strong number");
	}
	else {
		System.out.println(temp+ " is not a strong number");
	}

	}

}
