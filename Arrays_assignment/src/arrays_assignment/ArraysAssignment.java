package arrays_assignment;
import java.util.Scanner;
public class ArraysAssignment {

	public static void main(String[] args) {
    char alphabets[]= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    char numbers[]= {'1','2','3','5','6','7','8','9'};
    char specialCharacters[]= {'!','@','#','$','%','^','&','*','(',')'};
    //char pattern[]=new char[9];
    int counter=0;
    char[][] matrix=new char[3][3];
    for(int i=0;i<3;i++)
    {
    	matrix[i][0] = alphabets[counter % alphabets.length];
        matrix[i][1] = numbers[counter % numbers.length];
        matrix[i][2] = specialCharacters[counter % specialCharacters.length];
        counter++;
    	
    }
    //print the generated pattern
    System.out.println("The generated pettern");
    for(int i=0;i<3;i++)//row
    {
    	for(int j=0;j<3;j++)//col
    	{
    		System.out.print(matrix[i][j]);
    	}
    }
    
    System.out.println();
    //print the 3X3 matrix
    System.out.println("3x3 matrix:");
    for(int i=0;i<3;i++)
    {
    	for(int j=0;j<3;j++)
    	{
    		System.out.print(matrix[i][j]+ " ");
    	}
    	System.out.println();
    }
//    Scanner sc=new Scanner(System.in);
//    System.out.println("Do you want to continue:yes/no");
//    String option=sc.nextLine();
    
	}

}
