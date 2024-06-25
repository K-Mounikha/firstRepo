package exam;

public class Harshad_num {

	public static void main(String[] args) {
	int n=156,sum=0,temp=0;
	temp=n;
	while(n>0)
	{
		int r=n%10;
		sum+=r;
		n/=10;
	}
    if(temp%sum==0)
    {
    	System.out.println(temp + " is a harshad number");
    }
    else
    {
    	System.out.println(temp + " is not a harshad number");
    }
	}

}
