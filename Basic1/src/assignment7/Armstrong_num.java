/*
 58.  Armstrong Number is a positive number if it is equal to the sum of cubes of its digits is called Armstrong 
number and if its sum is not equal to the number then it’s not an Armstrong number. Examples: 153 is 
Armstrong, (1*1*1) +(5*5*5) +(3*3*3) = 153
 */
package assignment7;

public class Armstrong_num {

	public static void main(String[] args) {
		int n=153,temp=0,r=0,sum=0;
		temp=n;
		while(n>0){
			r=n%10;
			sum+=r*r*r;
			n/=10;
		}
		if(temp==sum) {
			System.out.println(temp+ " is Armstrong Number");
		}
		else {
			System.out.println(temp+ " is Not an Armstrong Number");
		}
	}

}
