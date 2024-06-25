//12. How do you concatenate two arrays in Java?
package arrays;

public class Concatenate_arrays {

	public static void main(String[] args) {
	int arr1[]= {9,4,1,2,5};
	int arr2[]= {6,7,8,9};
	int c[]=new int[arr1.length+arr2.length];
	for(int i=0;i<arr1.length;i++)
	{
		c[i]=arr1[i];
	}
	for(int j=0;j<arr2.length;j++)
	{
		c[j+arr1.length]=arr2[j];
	}
	System.out.println("concatenated array: ");
	for(int k=0;k<c.length;k++)
	{
		System.out.print(c[k]+ " ");
	}
	}

}
