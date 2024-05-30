/*Check Company Insures Drivers in Java?
   A company insures its drivers in the following cases:
   If the driver is married
   If the driver is unmarried, male & above 30 years of age
   If the driver is unmarried, female & above 25 years of age
   */
package assignment3;

public class Insurance {

     public static void main(String[] args) {
		  boolean isMarried = false;
		  boolean isMale = true;
		  int age = 35;
		   if (isMarried || (age > 30 && isMale) || (!isMarried && !isMale && age > 25)) {
		       System.out.println("The driver is insured.");
		    } else {
		         System.out.println("The driver is not insured.");
		     }
     }
}
