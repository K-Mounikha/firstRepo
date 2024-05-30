//Write a java program that accepts three numbers from the user and check if numbers are in "increasing" or "decreasing" order
package assignment3;

public class Increasing_Decreasing {

	public static void main(String[] args) {
	int num1=30,num2=20,num3=10;
	if(num1<num2 &&num2<num3) {
		System.out.println("numbers are in the increasing order");
	}
	else if (num1>num2 && num2>num3) {
        System.out.println("The numbers are in decreasing order");
    }
	else {
		System.out.println("numbers are not in increasing or decresing order");
	}

	}

}
