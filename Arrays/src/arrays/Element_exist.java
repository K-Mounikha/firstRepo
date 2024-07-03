//9. Check if an element exists in an array in Java?
package arrays;
import java.util.Scanner;
public class Element_exist {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	System.out.println("enter the element to check: ");
	int ele=sc.nextInt();
	int arr[]= {1,2,3,4,5,6};
	 boolean found = false;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==ele)
		{
			 found = true;
			 break;
			
		}
    }
	 if (found) {
         System.out.println("Element " + ele + " exists in the array.");
     } else {
         System.out.println("Element " + ele + " does not exist in the array.");
     }

	}

}
