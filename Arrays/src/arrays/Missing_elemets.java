// 23. How do you find the missing number in an array of integers in Java?
package arrays;

public class Missing_elemets {

	public static void main(String[] args) {
		int arr[]= {1,3,5,6,8,9,10};
		System.out.println("Missing elements: ");
		for(int i=1;i<=10;i++) 
		{
		boolean isPresent=checking(arr,i);
		if(isPresent==false)
		System.out.print(i+ " ");
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
