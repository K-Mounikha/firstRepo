package assignment7;
import java.util.Scanner; 
   public class Duck_num{  
      public static boolean checkNumber(int n) {
    	   while(n != 0) { 
		       if(n%10 == 0)  
		           return true;   
		           n=n/10;  
		        }  
		        return false; 
		   }  
		    public static void main(String args[])   
		    {     
		        int num;   
		        Scanner sc=new Scanner(System.in);    
		        System.out.println("Enter the number"); 
		        num = sc.nextInt();  
		          
		        if (checkNumber(num))   
		            System.out.println(num + " is a Duck number");   
		        else  
		            System.out.println(num + " is not a Duck number");   
		    }
}
