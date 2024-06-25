//5. Write a Java program to find the sum of all elements in an array.
package arrays;

public class Sum_array {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println("sum of array elements: "+sum);

	}

}
