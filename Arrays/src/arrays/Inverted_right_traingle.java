/*
26. Write a Java program to print the following pattern:
 *****
 ****
 ***
 **
 */
package arrays;

public class Inverted_right_traingle {

	public static void main(String[] args) {
	int n=5;
	for(int row=n;row>0;row--)
	{
		for(int col=1;col<=row;col++)
		{
			System.out.print("*");
		}
		System.out.println();
			
	}

	}

}
