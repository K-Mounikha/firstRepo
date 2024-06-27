package arrays_assignment;

public class LargestElement {
	//largest element
	public static void largest(int array[])
	{
		int largest_ele=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>largest_ele)
			{
				largest_ele=array[i];
			}
		}
		System.out.println("Largest element in an array: "+largest_ele);
	}
	//smallest element
	public static void smallest(int array[])
	{
		int smallest_ele=array[0];
		for(int i=0;i<array.length;i++)
		{
			if(array[i]<smallest_ele)
			{
				smallest_ele=array[i];
			}
		}
		System.out.println("smallest element in an array: "+smallest_ele);
	}
	//sum of all elements
	public static void sum_avg(int array[])
	{
		int sum=0;
		for(int i=0;i<array.length;i++)
		{
			sum+=array[i];
		}
		System.out.println("sum of array elements: "+sum);
		
		//average of an array elements
		float avg=sum/array.length;
		System.out.println("Average of an array elements: "+avg);
	}
	//Reversing of an array
	public static void reverse(int array[])
	{
		System.out.println("Reverse order: ");
		for(int i=array.length-1;i>=0;i--)
		{
			System.out.print(array[i]+ " ");
		}
		System.out.println();
	}
	//sorting an array in Ascending order
	public static void ascending(int array[])
	{
		int temp=0;
		System.out.println("Ascending order: ");
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]>array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		for(int k=0;k<array.length;k++)
		{
			System.out.print(array[k]+ " ");
		}
		System.out.println();
	}
	//sorting an array in Descending order
	public static void descending(int array[])
	{
		int temp1=0;
		System.out.println("Descending order: ");
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]<array[j])
				{
					temp1=array[i];
					array[i]=array[j];
					array[j]=temp1;
				}
			}
		}
		for(int k=0;k<array.length;k++)
		{
			System.out.print(array[k]+ " ");
		}
		System.out.println();
	}
	//concatenation of an array
	public static void concatenation(int array[])
	{
		int array2[]= {2,1,9,6};
		int array3[]=new int [array.length+array2.length];
		for(int i=0;i<array.length;i++)
		{
			array3[i]=array[i];
		}
		for(int j=0;j<array2.length;j++)
		{
			array3[j+array.length]=array2[j];
		}
		System.out.println("concatenated array: ");
		for(int k=0;k<array3.length;k++)
		{
			System.out.print(array3[k]+ " ");
		}
	}
	public static void main(String[] args) {
	int array[]= {5,4,6,8,9};
	int temp[]=new int[array.length];
	LargestElement l=new LargestElement();
	l.largest(array);
	l.smallest(array);
	l.sum_avg(array);
	l.reverse(array);
	l.ascending(array);
	l.descending(array);
	l.concatenation(array);
  }
}
