/*
 25. Write a Java program to print the following pattern:
 1
 22
 333
 4444
 55555
 */
package arrays;

public class Number_pattern_row {

	public static void main(String[] args) {
		int n=5;
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(row);
			}
			System.out.println();
		}

	}

}
