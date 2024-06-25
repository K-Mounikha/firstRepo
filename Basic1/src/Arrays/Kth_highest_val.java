package Arrays;
import java.util.Scanner;
public class Kth_highest_val {

	public static void main(String[] args) {
		int a[]= {6,2,3,5,7,8,1,4};
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]+ " ");
		}
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the position value");
		int pos=sc.nextInt();
		System.out.println("highest value: "+a[a.length-pos]);

	}

}
