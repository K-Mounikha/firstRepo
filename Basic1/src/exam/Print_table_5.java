package exam;

public class Print_table_5 {

	public static void main(String[] args) {
		int n = 10;
		int table=5;
        int evenMultiples[]=new int[n];
        int oddMultiples[]=new int[n];
        for (int i=1;i<=n;i++) {
            int multiple=table*i;
            System.out.println(table+"*"+i+"="+ multiple);
            if(multiple%2==0) {
                evenMultiples[i - 1]=multiple;
            } else{
                oddMultiples[i - 1]=multiple;
            }
        }
        
        System.out.println("Even multiples of 5:");
        printArray(evenMultiples);
        
        System.out.println("Odd multiples of 5:");
        printArray(oddMultiples);
        int merge[]=mergeArrays(evenMultiples,oddMultiples);
        System.out.println("merged array: ");
        printArray(merge);
        int sum=calculateSum(merge);
        System.out.println("sum of total elemets of the array: "+sum);
        boolean isDuckNumber = isDuckNum(sum);
        System.out.println("Is the sum a duck number? " + isDuckNumber);
    }//method to merge the array elements
	public static int[] mergeArrays(int evenArray[],int oddArray[])
	{
		int merge[]=new int[evenArray.length+oddArray.length];
		int index=0;
		for(int i=0;i<evenArray.length;i++)
		{
			merge[i]=evenArray[i];
		}
		for(int j=0;j<oddArray.length;j++)
		{
			merge[j+evenArray.length]=oddArray[j];
		}
    
		return merge;
		
	}
    //iterates over the array elemets
    public static void printArray(int[] arr) {
        for (int num : arr) {
            if (num != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
    //method to calculate array sum 
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    //find the given sum is duck number or not
    public static boolean isDuckNum(int sum)
    {
    	if(sum==0 ||sum<10)
    	{
    		return false;
    	}
    	while(sum>0)
    	{
    		int digit=sum%10;//get last digit
    		sum=sum/10;
    		// If the remaining number is still positive and we find a zero, it's a duck number
    		if(digit==0 && sum!=0)
    		{
    			return true;
    		}
    	}
    	return false;
    }
}

