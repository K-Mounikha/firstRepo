//Write a program to input week number and print week day?
package assignment3;

public class WeekDay {

	public static void main(String[] args) {
	int week_num=1;
	String week_day =" ";
	if(week_num==1) {
		week_day="sunday";
	}
	else if(week_num==2) {
		week_day="monday";
	}
	else if(week_num==3) {
		week_day="tuesday";
	}
	else if(week_num==4) {
		week_day="wednesday";
	}
	else if(week_num==5) {
		week_day="thursday";
	}
	else if(week_num==6) {
		week_day="friday";
	}
	else if(week_num==7) {
		week_day="saturday";
	}
	else {
		System.out.println("week day should be 1 to 7");
	}
	System.out.println("weekday:" +week_day);
	}

}
