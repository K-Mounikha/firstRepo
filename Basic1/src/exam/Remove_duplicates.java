package exam;

public class Remove_duplicates {
	public static int[] removeDuplicates(int arr[]) {
    int n = arr.length;
    if (n == 0 || n == 1) {
        return arr;
    }
    
    // Temporary array to store unique elements
    int[] temp = new int[n];
    int j = 0;

    // Iterate over the array
    for (int i = 0; i < n; i++) {
        boolean isDuplicate = false;

        // Check if the element is already in the temp array
        for (int k = 0; k < j; k++) {
            if (arr[i] == temp[k]) {
                isDuplicate = true;
                break;
            }
        }

        // If the element is not a duplicate, add it to temp
        if (!isDuplicate) {
            temp[j++] = arr[i];
        }
    }

    // Create a new array with the size equal to the number of unique elements
    int[] result = new int[j];
    for (int i = 0; i < j; i++) {
        result[i] = temp[i];
    }

    return result;
}
public static void main(String[] args) {
    int[] arr = {1,4,2,6,8,2,3,1,3,5,1,2,1,4,5,1};

    // Call the method to remove duplicates
    int[] result = removeDuplicates(arr);

    // Print the result array
    System.out.println("Array after removing duplicates:");
    for (int value : result) {
        System.out.print(value + " ");
    }
}
}




