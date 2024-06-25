//20.Write a Java program to convert a numeric grade to a letter grade. 
package assignment7;
import java.util.Scanner;
public class LetterGrade {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the numeric grade: ");
	        int grade = sc.nextInt(); 
	        String letterGrade="";
	        if (grade >= 90 && grade <= 100) {
	            letterGrade ="A";
	        } 
	        else if (grade >= 80 && grade < 90) {
	        	letterGrade ="B";
	        } 
	        else if (grade >= 70 && grade < 80) {
	        	letterGrade ="C";
	        } 
	        else if (grade >= 60 && grade < 70) {
	        	letterGrade ="D";
	        }  
	        else {
	            letterGrade="F- fail";
	        }
	        System.out.println("The letter grade is: " + letterGrade);

	}

}
