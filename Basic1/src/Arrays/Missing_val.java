//find missing elements from the array
package Arrays;

public class Missing_val {

	public static void main(String[] args) {
	int arr[]= {1,3,5,6,8,9,10};
	for(int i=1;i<=10;i++) 
	{
	boolean isPresent=checking(arr,i);
	if(isPresent==false)
	System.out.println(i);
	}
	}
	public static boolean checking(int arr[],int i) {
	for(int k=0;k<arr.length;k++)
	{
		if(arr[k]==i)
	    	return true;
		
	}
	return false;
		
	}
}
