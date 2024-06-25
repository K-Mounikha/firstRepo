package exam;

public class Even_Odd_Zero_Array {

	public static void main(String[] args) {
	 int[] array = {1,3,2,4,5,2,8,0,1,0,3,7,8,9,0};
     int[] resultArray = placeValues(array);
	 // Print the modified array
	 System.out.print("Final array: "+ " ");
	 for(int num:resultArray) {
		 System.out.print(num +" ");
	 }
	}
    public static int[] placeValues(int[] array) {
    	int n=array.length;
    	int[] result=new int[n];
    	int evenIndex=0;
    	int oddIndex=1;
        // Initialize result array with zeros manually
    	for(int i=0;i<n;i++)
    	{
    		result[i]=0;
    	}
		// Place even and odd numbers at their respective positions
    	for(int i=0;i<n;i++)
    	{
    		if (array[i]==0)
    		{
    			continue;
    		}
    		else if(array[i]%2==0)
    		{
    			while(evenIndex<n && result[evenIndex]!=0 )
    			{
    				evenIndex+=2;
    			}
    			if(evenIndex<n)
    			{
    				result[evenIndex]=array[i];
    			}
    		}else
    		{
    			while(oddIndex<n && result[oddIndex]!=0)
    			{
    				oddIndex+=2;
    			}
    			if(oddIndex<n)
    			{
    				result[oddIndex]=array[i];
    			}
    		}
    	}
    	return result;
    }
}


     
