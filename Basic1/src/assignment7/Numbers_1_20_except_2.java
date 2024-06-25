// Print Prime Numbers from 1 to 20 Except 2.
package assignment7;

public class Numbers_1_20_except_2 {

	public static void main(String[] args) {
	for(int i=1;i<=20;i++)
	{
		if(i==2)
			continue;
		System.out.print(i+ " ");
	}

	}

}
