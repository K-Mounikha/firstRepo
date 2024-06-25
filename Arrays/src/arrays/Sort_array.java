// 11. How do you sort an array in Java?
package arrays;
import java.util.Arrays;
public class Sort_array {

	public static void main(String[] args) {
	int arr[]= {8,4,9,1,3};
	 System.out.println("Original array:");
     printArray(arr);
     Arrays.sort(arr);
     System.out.println("Sorted array:");
     printArray(arr);
 }
 public static void printArray(int[] arr) {
     for (int num:arr) {
         System.out.print(num+ " ");
     }
     System.out.println();
	}

}
