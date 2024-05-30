//Write a program to count total number of notes in given amount?
package assignment3;

public class Num_of_notes {

	public static void main(String[] args) {
    int amount=1653;
    int n500,n100,n50,n20,n5,n2,n1;
    n500=n100=n50=n20=n5=n2=n1=0;
    if(amount>=500) {
    	n500=amount/500;
    	amount = amount-n500*500;
    	}
     if(amount>=100) {
    	n100 = amount/100;
    	amount = amount-n100*100;
    }
     if(amount>=50) {
    	n50=amount/50;
    	amount=amount-n50*50;
    	
    }
     if(amount>=20) {
    	n20=amount/20;
    	amount=amount-n20*20;
    }
     if(amount>=5) {
    	n5=amount/5;
    	amount=amount-n5*5;
    	
    }
    if(amount>=2) {
    	n2=amount/2;
    	amount=amount-n2*2;
    	
    }
     if(amount>=1) {
    	n1=amount/1;
    	amount=amount-n1*1;
    	
    }
    System.out.println("five hundred notes: "+n500);
    System.out.println("hundred notes: "+n100);
    System.out.println("fifty notes: "+n50);
    System.out.println("twenty notes: "+n20);
    System.out.println("five rupees: "+n5);
    System.out.println("two rupees: "+n2);
    System.out.println("one rupees: "+n1);
	}

}
