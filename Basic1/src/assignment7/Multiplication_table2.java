//79. Write a Java program to display the multiplication table of a given number
package assignment7;
import java.util.Scanner;
public class Multiplication_table2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the table  you want: ");
		int table=sc.nextInt();
		System.out.println("enter the num of multiples: ");
		int multiples=sc.nextInt();
		int i=1;
		while(i<=multiples) {
			System.out.println(table+"*"+i+"="+table*i);
			i++;
		}

	}

}
