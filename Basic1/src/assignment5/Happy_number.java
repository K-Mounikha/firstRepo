//Happy Number
package assignment5;

public class Happy_number {

	public static void main(String[] args) {
		int number = 7; 
        int result = number;
        
        while (result != 1 && result != 4) {
            int sum = 0;
            int temp = result;
            while (temp > 0) {
                int r = temp % 10; 
                sum += r * r; 
                temp /= 10;         
            }
            
           result = sum;  
        }
       
        if (result== 1) {
            System.out.println(number + " is a happy number");
        } else {
            System.out.println(number + " is not a happy number.");
        }

	}

}
