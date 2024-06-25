/*
44. In a company, worker efficiency is determined on the basis of the time required for a worker to complete a 
particular job. If the time taken by the worker is between 2 – 3 hours, then the worker is said to be highly 
efficient. If the time required by the worker is between 3 – 4 hours, then the worker is ordered to improve 
speed. If the time taken is between 4 – 5 hours, the worker is given training to improve his speed, and if the 
time taken by the worker is more than 5 hours, then the worker has to leave the company. If the time taken by 
the worker is input through the keyboard, find the efficiency of the worker 
 */
package assignment7;
import java.util.Scanner;
public class Worker_efficiency {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the time taken by the worker");
	double timetaken=sc.nextDouble();
	if(timetaken>=2 && timetaken<3)
	{
		System.out.println("the worker is highly efficient");
	}
	else if(timetaken>=3 &&timetaken<4)
	{
		System.out.println("the worker need to improve the speed");
	}
	else if(timetaken>=4 &&timetaken<5)
	{
		System.out.println("the worker is given training to improve his speed");
	}
	else if(timetaken>5)
	{
		System.out.println("the worker has to leave the company");
	}
	else
	{
		System.out.println("invalid input");
	}

	}

}
