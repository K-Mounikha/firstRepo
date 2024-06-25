package exam;

public class Highest_palindrome_num {

	public static void main(String[] args) {
	int arr[]= {2357,568568,1238321,2325532};
	int highestPalindrome = findHighestPalindrome(arr);
    if (highestPalindrome!=-1) {
        System.out.println("The highest palindrome number in the given array is: " + highestPalindrome);
    } else {
        System.out.println("No palindrome numbers found in the array.");
    }

	}
	 // Method to check if a number is a palindrome or not
	public static boolean isPalindrome(int num)
	{
		int temp=num;
		int rev=0;
		while(num>0)
		{
			int r=num%10;//get the last digit
			rev=rev*10+r;//shift all the current digits of reversed one place to the left (like adding a new digit at the end).
			num/=10;//remove the last digit
		}
		return temp==rev;
	}
	public static int findHighestPalindrome(int arr[])
	{
		int highestPalindrome=-1;// handle cases where no palindrome numbers are found in the array.
		for(int num:arr)
		{
			if(isPalindrome(num))
			{
				if(num>highestPalindrome)
				{
					highestPalindrome=num;
				}
			}
		}
		return highestPalindrome;
	}

}
