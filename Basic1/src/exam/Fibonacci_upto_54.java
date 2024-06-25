package exam;

public class Fibonacci_upto_54 {

	public static void main(String[] args) {
		 int maxNumber = 54; 
	        printFibonacciSeries(maxNumber);
	    }
	    public static void printFibonacciSeries(int maxNumber) {
	        int n1 = 0;
	        int n2 = 1;
	        System.out.print("Fibonacci series up to " + maxNumber + ": ");
            while(n1<=maxNumber){
	            System.out.print(n1 + " ");
	            int n3=n1+n2;
	            n1=n2;
	            n2=n3;
	        }

	}

}
