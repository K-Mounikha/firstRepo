//Greatest of three numbers using nested ternary opeartor
package assignment2;

public class Greatest_three_ternary {

	public static void main(String[] args) {
		int a=10,b=20,c=30;
		int result= a>b?(a>c?a:c):(b>c?b:c);
		System.out.println("greatest number:"+result);//30


	}

}
