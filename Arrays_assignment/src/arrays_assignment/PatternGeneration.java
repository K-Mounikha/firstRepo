package arrays_assignment;

public class PatternGeneration {

	public static void main(String[] args) {
		char alphabets[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        //char numbers[] = {'1','2','3','5','6','7','8','9'};
		int number[]= {1,2,3,4,5,6,7,8,9};
        char specialCharacters[] = {'!','@','#','$','%','^','&','*','(',')'};
        int counter = 0;
        char[][] matrix = new char[3][3];
        for(int i=0;i<10;i++)
        {
        	
        }

        // Print the generated pattern
        System.out.println("The generated pattern:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j]);
            }
        }

        System.out.println();
        // Print the 3x3 matrix
        System.out.println("3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}