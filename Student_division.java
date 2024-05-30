//Calculate Student Percentage and Print Division in Java?
package assignment3;

public class Student_division {

	public static void main(String[] args) {
		int s1=75,s2=90,s3=86;
		float total=s1+s2+s3;
		float percentage=total/3;
		String division;
		if(percentage>=60) {
			division="first division";
		}
		else if(percentage>=45) {
			division="second division";
		}
		else if(percentage>=35){
			division="third division";
		}
		else {
			division="fail";
		}
		System.out.println("percentage: "+percentage);
		System.out.println("Division:"+division);

	}

}
