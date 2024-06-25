package exam;

public class Pyramid {

	public static void main(String[] args) {
		int n=5;
		 for (int row = 1; row <=n; row++) {
	         for (int sp=1; sp<=n-row; sp++) {
	             System.out.print(" ");
	         }
	         for (int col= 1; col<=row; col++) {
	             System.out.print("* ");
	         }
	         System.out.println();
	     }

	}

}
