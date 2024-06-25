//7. Write a Java program to count the number of even and odd elements in an array.
package arrays;
public class Count_even_odd {

	public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	int even_count=0;
	int odd_count=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]%2==0)
		{
			even_count++;
		}
		else
		{
			odd_count++;
		}
	}
	System.out.println("Even count: "+even_count);
	System.out.println("Odd count: "+odd_count);
	}

}
