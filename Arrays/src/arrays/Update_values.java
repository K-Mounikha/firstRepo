//4. Initialise an array and update its values with new values and print the updated array.
package arrays;

public class Update_values {

	public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	System.out.println("Original array:");
    printArray(arr);
    arr[0] = 10;
    arr[1] = 20;
    arr[2] = 30;
    arr[3] = 40;
    arr[4] = 50;
    System.out.println("updated array:");
    printArray(arr);
	}
	public static void printArray(int arr[])
	{
		for(int num:arr)
		{
			 System.out.print(num+ " ");
        }
        System.out.println();
		}
	
	}
