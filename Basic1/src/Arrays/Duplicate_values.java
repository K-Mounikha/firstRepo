package Arrays;

public class Duplicate_values {

	public static void main(String[] args) {
	int a[]= {1,4,2,6,8,2,3,1,3,5,1,2,1,4,5,1};
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				System.out.print(a[i]+ " ");
			}
		}
	}

	}

}
