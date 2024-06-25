package assignment7;
import java.util.Scanner;
public class Library {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of days");
    int days=sc.nextInt();
    String message=" ";
    if(days<=5)
    {
      	message="fine:50 paise";
    }
    else if(days>5 &&days<=10)
    {
    	message="fine:1 rupee";
    }
    else if(days>10 && days<=30)
    {
    	message="fine:5 rupees";
    }
    else if(days>=30)
    {
    	message="your membership is cancelled";
    }
    else
    {
    	message="no fine";
    }
    System.out.println(message);
}
}
