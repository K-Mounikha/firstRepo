// 6. Write a Java program to find the average of all elements in an array.
package arrays;

public class Average_array {

	public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	int total=0;
	float avg=0;
	for(int i=0;i<arr.length;i++)
	{
		total+=arr[i];
	}
	avg=total/arr.length;
	System.out.println("average: "+avg);

	}

}
