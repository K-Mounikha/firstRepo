package exam;

public class Dupliacte {
 
	public static void main(String[] args) {
		int a[]= {1,4,2,6,8,2,3,1,3,5,1,2,1,4,5,1};
		int find_highest=highestRepeatedNum(a);
		System.out.println("highest repeated element:"+find_highest);
	}
    public static int highestRepeatedNum(int a[]) {
	int n=a.length;
	int counts[]=new int[n];//array of integers to store the count of occurrences of each element.
	int maxcount=0;
	int find_highest=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					counts[i]++;
				}
			}
		}
		//find the element with the maximum count
		for(int i=0;i<n;i++)
		{
			if(counts[i]>maxcount)
			{
				maxcount=counts[i];
				find_highest=a[i];
			}
		}
		return find_highest;
	}
}


