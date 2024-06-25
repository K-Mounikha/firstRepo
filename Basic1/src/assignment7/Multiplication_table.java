//53. Print the multiplication table of a given number. 
package assignment7;
import java.util.Scanner;
public class Multiplication_table {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the table you want");
	int table=sc.nextInt();
	for(int i=1;i<=10;i++)
	{
		System.out.println(table+"*"+i+"="+(table*i));
	}

	}

}
