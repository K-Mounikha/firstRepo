//Assign values of variables 'a' and 'b' as 55 and 70 respectively and then check if both the conditions 'a < 50' and 'a < b' are true
package assignment2;

public class Conditions_check {

	public static void main(String[] args) {
		int a=55, b=70;
		//check if both the conditions 'a < 50' and 'a < b' are true
		boolean result= (a<50) && (a<b);//false
		System.out.println(result);


	}

}
