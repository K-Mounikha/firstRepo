//27.When the value of i becomes 4 or 18, skips its execution but for other values of i, the loop will run smoothly.
package assignment7;

public class Skips_4_18 {

	public static void main(String[] args) {
	for(int i=1;i<=20;i++)
	{
		if(i==4 || i==18)
			continue;
		System.out.print(i+ " ");
	}
	

	}

}
