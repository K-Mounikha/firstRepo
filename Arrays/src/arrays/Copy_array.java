// 19. How do you copy an array in Java?
package arrays;
import java.util.Arrays;
public class Copy_array {

	public static void main(String[] args) {
		int [] array= {1, 2, 3, 4, 5, 6};
        int [] destination = new int[array.length];
        for (int i=0;i<array.length;i++) {
            destination[i]=array[i];
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for (int i=0;i<destination.length;i++) {
            System.out.print(destination[i]+" ");
        }

	}

}
