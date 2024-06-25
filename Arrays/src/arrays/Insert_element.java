//17. How do you insert an element into an array in Java?
package arrays;
import java.util.Arrays;
public class Insert_element {

	public static void main(String[] args) {
	int arr[]= {1,2,3,4,6,7,8,9};
	int element=5;
	int position=4;
	int[] newArray = insertElement(arr,element,position);
	System.out.println("original array: "+Arrays.toString(arr));
	System.out.println("Array after element insertion: "+Arrays.toString(newArray));
	}
	public static int[] insertElement(int arr[],int element,int position)
	{
		int newArray[]=new int[arr.length+1];
		for(int i=0;i<position;i++)
		{
			newArray[i]=arr[i];
		}
		newArray[position]=element;
		for (int i=position + 1;i<newArray.length;i++) {
		    newArray[i]=arr[i-1];
		}
		return newArray;
	}
}


