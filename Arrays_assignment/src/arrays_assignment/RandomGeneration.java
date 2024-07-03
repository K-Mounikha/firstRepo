package arrays_assignment;
import java.util.Random;
public class RandomGeneration {

	public static void main(String[] args) {
		char alphabets[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char numbers[] = {'1','2','3','5','6','7','8','9'};
        char specialCharacters[] = {'!','@','#','$','%','^','&','*','(',')'};
        char[][] matrix = new char[3][3];
        Random random = new Random();
	        for (int i = 0; i < 3; i++) {
	            matrix[i][0] = alphabets[random.nextInt(alphabets.length)];
	            matrix[i][1] = numbers[random.nextInt(numbers.length)];
	            matrix[i][2] = specialCharacters[random.nextInt(specialCharacters.length)];
	        }
	        System.out.print("Generated Pattern: ");
	        System.out.println();
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(matrix[i][j]);
	            }
	        }
	        System.out.println();
	         // Print the 3x3 matrix
	        System.out.println("3x3 Matrix:");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }

	}

}
