//13. How do you find the minimum value in an array in Java?
package arrays;

public class Minimum_value {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Minimum value in the array is: "+min);


	}

}
