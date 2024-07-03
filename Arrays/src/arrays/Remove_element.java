//16. How do you remove an element from an array in Java?
package arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Remove_element {

	public static void main(String[] args) {
	int arr[]= {10,20,30,40,50};
	int c[]=new int[arr.length-1];
	System.out.println("Original Array : ");
	System.out.println(Arrays.toString(arr));
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the index number: ");
	int pos=sc.nextInt();
	for(int i=0;i<arr.length;i++)
	{
		if(i<pos)
		{
			c[i]=arr[i];
		}
		else if(i>pos)
		{
			c[i-1]=arr[i];
		}
	}
	System.out.print("Array after removing the element at index "+ pos+" " + Arrays.toString(c));

	}

}
