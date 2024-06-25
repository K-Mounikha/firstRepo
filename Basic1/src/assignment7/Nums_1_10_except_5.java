//Write a java program to print number from 1 to 10 Except 5
package assignment7;

public class Nums_1_10_except_5 {

	public static void main(String[] args) {
	for(int i=1;i<=10;i++)
	{
		if(i==5)
			continue;
		 System.out.print(i+ " ");
	}
	}

}
