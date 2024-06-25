/*
  Write a program to read the value of an integer m and display the value of n is 1 
    when m is larger than 0, 0 when m is 0 and -1 when m is less than 0. 
 */
package assignment7;
import java.util.Scanner;
public class Integer_m_n {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter m value:");
		int m = sc.nextInt();
		int n=0;
		if(m>0) {
			n=1;
		}
		else if(m==0) {
			n=0;
		}
		else if(m<0) {
			n=-1;
		}
		System.out.println(n);


	}

}
