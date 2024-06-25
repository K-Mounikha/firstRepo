//20. How do you compare two arrays in Java?
package arrays;
import java.util.Arrays;
public class Compare_two_Arrays {

	public static void main(String[] args) {
	int a1[]= {1,2,3,4,5};
	int a2[]= {1,2,3,4,5};
	/*if(Arrays.equals(a1, a2))
	{
		System.out.println("Arrays are equal");
	}
	else
	{
		System.out.println("Arrays are not equal");
	}*/
	boolean isEqual=compareArrays(a1,a2);
	System.out.println("Arrays are equal? "+ isEqual);

	}
	public static Boolean compareArrays(int a1[],int a2[])
	{
		if(a1==null && a2==null)
		{
			return true;
		}
		if(a1==null || a2==null)
		{
			return false;
		}
		if(a1.length!=a2.length)
		{
			return false;
		}
		for(int i=0;i<a1.length;i++)
		{
			if(a1[i]!=a2[i])
			{
				return false;
			}
		}
		return true;
	}

}
