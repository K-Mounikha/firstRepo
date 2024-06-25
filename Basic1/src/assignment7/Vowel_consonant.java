//Write a program to input any alphabet and check whether it is vowel or consonant. 
package assignment7;
import java.util.Scanner;
public class Vowel_consonant {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the character");
    char ch=sc.next().charAt(0);
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
    {
    	System.out.println("vowel");
    }
    else
    {
    	System.out.println("consonent");
    }
	}

}
