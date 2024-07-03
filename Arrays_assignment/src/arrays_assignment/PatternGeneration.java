package arrays_assignment;

public class PatternGeneration {

	public static void main(String[] args) {
		char alphabets[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char numbers[] = {'1','2','3','5','6','7','8','9'};
        char specialCharacters[] = {'!','@','#','$','%','^','&','*','(',')'};
        int counter = 0;
        char[][] matrix = new char[3][3];

        int a = 0;
        int b = 1;

        for (int i = 0; i < 3; i++) {
            int next = (a + b) % alphabets.length;
            matrix[i][0] = alphabets[next];
            a = b;
            b = next;

            next = (a + b) % numbers.length;
            matrix[i][1] = numbers[next];
            a = b;
            b = next;

            next = (a + b) % specialCharacters.length;
            matrix[i][2] = specialCharacters[next];
            a = b;
            b = next;

            counter++;
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