//26.  Print Prime Numbers from 1 to 20 Except 2. 
package assignment7;

public class Primenums {

	public static void main(String[] args) {
		System.out.println("prime numbers from 1 to 10 except 2");
		int count;
		for (int i=2;i<=20;i++) {
			count=0;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					count++;
				}
			}
		if(i==2) {
			continue;
		}
		else if(count==0) {
			System.out.print(i+ " ");
		}	
		}
	}
}

