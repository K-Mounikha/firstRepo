//Calculate Student Percentage and Grade in Java?
package assignment3;

public class Percentage_grade {

	public static void main(String[] args) {
		int s1=75,s2=90,s3=86;
		float total=s1+s2+s3;
		float percentage=total/3;
		char grade;
		if(percentage>=90) {
			grade='A';
		}
		else if(percentage>=80) {
			grade='B';
		}
		else if(percentage>=70) {
			grade='c';
		}
		else if(percentage>=60) {
			grade='D';
		}
		else if(percentage>=50) {
			grade='E';
		}
		else {
			grade='F';
		}
		System.out.println("percentage: "+percentage);
		System.out.println("grade:"+grade);
		
		
	}

}
