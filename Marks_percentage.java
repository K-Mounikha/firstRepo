//If the marks of Robert in three subjects are 78,45 and 62 respectively (each out of 100 ), write a program to calculate his total marks and percentage marks.


package assignment1;

public class Marks_percentage {

	public static void main(String[] args) {
		int s1=78,s2=45,s3=62;
		float total = s1 + s2 + s3;//185.0
		float percentage = ((total/300)*100);//61.66
		System.out.println("Total marks:"+total);
		System.out.println("Percentage:"+percentage+"%");

	}

}
