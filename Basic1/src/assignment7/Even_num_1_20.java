//36.Write a program to print all even numbers from 1 to 20 using a for loops. Use the continue statement to skip the odd numbers.
package assignment7;

public class Even_num_1_20 {

	public static void main(String[] args) {
	for(int i=1;i<=20;i++)
	{
		if(i%2!=0) {
		  continue;
		}
		System.out.print(i+ " ");
	}

	}

}
