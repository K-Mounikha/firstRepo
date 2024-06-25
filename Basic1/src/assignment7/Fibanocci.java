// Write a java program to print 10 Fibonacci numbers skip 13 and 35. 
package assignment7;

public class Fibanocci {

	public static void main(String[] args) {
		int n1=0, n2=1;
		for (int i=0;i<=10;i++) {
			if(n1==13 || n1==35) {
				int n3= n1+n2;
				n1=n2;
				n2=n3;
				continue;
			}
			System.out.print(n1+ " ");
			int n3=n1+n2;
			n1=n2;
			n2=n3;
		}

	}

}
