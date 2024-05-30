//Write a program to input month number and print month Name?
package assignment3;

public class Month_Name {

	public static void main(String[] args) {
		int month_num=1;
		String month_name =" ";
		if(month_num==1) {
			month_name="january";
		}
		else if(month_num==2) {
			month_name="february";
		}
		else if(month_num==3) {
			month_name="march";
		}
		else if(month_num==4) {
			month_name="april";
		}
		else if(month_num==5) {
			month_name="may";
		}
		else if(month_num==6) {
			month_name="june";
		}
		else if(month_num==7) {
			month_name="july";
		}
		else if(month_num==8) {
			month_name="auguest";
		}
		else if(month_num==9) {
			month_name="september";
		}
		else if(month_num==10) {
			month_name="0ctober";
		}
		else if(month_num==11) {
			month_name="november";
		}
		else if(month_num==12) {
			month_name="december";
		}
		else {
			System.out.println("month number should be 1 to 12");
		}
		System.out.println("month name:" +month_name);
		}

	}

