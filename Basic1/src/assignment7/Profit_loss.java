// Write a program to calculate profit and loss on a transaction. (inputs from scanner class , SellingPrice and CostPrice).
package assignment7;
import java.util.Scanner;
public class Profit_loss {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the selling price");
	int sp=s.nextInt(); //sp=selling price.
	System.out.println("enter the cost price");
	int cp=s.nextInt(); //cp=cost price.
	int profit=sp-cp;
    int loss=cp-sp;
    
    if(sp>cp)
    {
    	System.out.println("profit:"+profit);
    }
    else {
    	System.out.println("loss: "+loss);
    }

	}

}
