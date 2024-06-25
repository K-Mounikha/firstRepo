package assignment6;
import java.util.Scanner;

public class Ques1 {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the table");
    int table=sc.nextInt();
    System.out.println("Enter the number of multiples");
    int multiples=sc.nextInt();
    System.out.println("Do you want even or odd multiples");
    String even_odd=sc.next();
    int i;
    switch(even_odd)
    {
    case "even":
    	for(i=2;i<=multiples;i++)
    	{
    		if(i%2==0)
    		{
    			System.out.println(table+ "*" +i+ "="+ (table*i));
    		}
    	}
    	break;
    case "odd":
    	for(i=1;i<=multiples;i++)
    	{
    		if(i%2!=0)
    		{
    			System.out.println(table+ "*" +i+ "="+ (table*i));
    		}
    	}
    	break;
    default:
    	System.out.println("enter valid information");
    	
    }
    

	}

}
