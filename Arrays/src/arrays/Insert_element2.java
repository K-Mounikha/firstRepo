package arrays;

public class Insert_element2 {

	public static void main(String[] args) {
	int arr[]= {1,2,3,4,6,7,8,9};
	int element=5;
	int position=4;
	int[] newArray = insertElement(arr,element,position);
	System.out.println("original array: ");
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.println("Array after inserting element:");
	for (int i = 0; i < newArray.length; i++) {
        System.out.print(newArray[i]+" ");
	}
	}
	 public static int[] insertElement(int arr[], int element, int position) {
	        int newArray[] = new int[arr.length + 1];
	        for (int i=0;i<position;i++) {
	            newArray[i]=arr[i];
	        }
	        newArray[position]=element;
	        for (int i=position+1;i<newArray.length;i++) {
	            newArray[i]=arr[i-1];
	        }
	        return newArray;
	    }

}
