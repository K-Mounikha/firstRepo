// 76.  Write a java program to check if a given number is prime or not using a do-while loop
package assignment7;
import java.util.Scanner;
public class Primenum_dowhile {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
	        int number;
	        String choice;
	        do {
	            System.out.print("Enter a number to check if it is prime: ");
	            number=sc.nextInt();
	            boolean isPrime = true;

	            if (number <= 1) {
	                isPrime = false;
	            } 
	            else {
	            	 int divisor=2;
	                 while(divisor<=number/2){//if the number is divisible by any number greater than its half
	                     if(number%divisor==0) {
	                         isPrime = false;
	                         break;
	                     }
	                     divisor++;
	                 }
	             }

	             if (isPrime) {
	                 System.out.println(number + " is a prime number.");
	             } else {
	                 System.out.println(number + " is not a prime number.");
	             }

	             System.out.print("Do you want to check another number? (yes/no): ");
	             choice = sc.next();
	         } while (choice.equals("yes"));
	}
}
