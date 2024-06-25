//Write a program to calculate profit or loss?
package assignment3;

public class Profit_loss {

	public static void main(String[] args) {
    int sp=1000,cp=987;
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
