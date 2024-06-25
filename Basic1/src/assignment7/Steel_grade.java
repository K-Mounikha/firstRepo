/*
 42. A certain grade of steel is graded according to the following conditions 
1.  Hardness must be greater than 50 
2.  Carbon content must be less than 0.7 
3.  Tensile strength must be greater than 5600 
The grades are as follows: 
●        Grade is 10 if all three conditions are met 
●        Grade is 9 if conditions (i) and (ii) are met 
●        Grade is 8 if conditions (ii) and (iii) are met 
●        Grade is 7 if conditions (i) and (iii) are met 
●        Grade is 6 if only one condition is met 
●        Grade is 5 if none of the conditions are met 
Write a program, which will require the user to give values of hardness, carbon content and tensile strength of 
the steel under consideration and output the grade of the steel. 
 */
package assignment7;
import java.util.Scanner;
public class Steel_grade {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the hardness of the steel");
	int hardness=sc.nextInt();
	System.out.println("enter the carbon content of the steel");
	double carbon_content=sc.nextDouble();
	System.out.println("enter the tensile strength of the steel");
	int tensile_strength=sc.nextInt();
	int grade=0;
	if(hardness>50 && carbon_content<0.7 && tensile_strength>5600)
	{
		grade=10;
	}
	else if(hardness>50 && carbon_content<0.7)
    {
		grade=9;
	}
	else if(carbon_content<0.7 && tensile_strength>5600)
	{
		grade=8;
	}
	else if(hardness>50 && tensile_strength>5600)
	{
		grade=7;
	}
	else if(hardness>50 || carbon_content<0.7 || tensile_strength>5600)
	{
		grade=6;
	}
	else
	{
		grade=5;
	}
	System.out.println("grade of the steel "+ grade);
	}

}
