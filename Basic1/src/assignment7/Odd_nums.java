//32.Print Odd numbers from 50 to 100 Except 53, 97, 77. 
package assignment7;

public class Odd_nums {

	public static void main(String[] args) {
	for(int i=50;i<=100;i++)
	{
		if(i%2!=0) {
			if(i==53||i==97||i==77)
				continue;
		System.out.print(i +" ");
		}
	}

	}

}
