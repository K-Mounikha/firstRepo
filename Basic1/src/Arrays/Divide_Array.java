package Arrays;
import java.util.Arrays;
public class Divide_Array {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int pos=4;
		if(pos<0 || pos>arr.length)
		{
			System.out.println("invalid position");
		}
		int part1[]=new int[pos+1];
		for(int i=0;i<=pos;i++)
		{
			part1[i]=arr[i];
		}
		int part2[]=new int[arr.length-pos-1];
		for(int i=pos+1;i<arr.length;i++)
		{
			part2[i-(pos+1)]=arr[i];
		}
		System.out.println("first part: "+Arrays.toString(part1));
		System.out.println("second part: "+Arrays.toString(part2));
		
}
}
