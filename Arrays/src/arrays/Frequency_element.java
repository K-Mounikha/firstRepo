//21. How do you find the frequency of an element in an array in Java?
package arrays;
import java.util.Scanner;
public class Frequency_element {

	public static void main(String[] args) {
    int arr[]= {1,2,3,4,5,6,2,3,4,8,9};
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the element");
    int element=sc.nextInt();
    int count=0;
    for(int i=0;i<arr.length;i++)
    {
    	if(arr[i]==element)
    	{
    		count++;
    	}
    }
    System.out.println("frequency of "+element+" "+"is "+count);

	}

}
