//10. Print the elements of an array in the reverse order
package arrays;

public class Reverse_order {

	public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	System.out.println("Reverse order: ");
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.print(arr[i]+" ");
	}
 
	}

}
