//1.Program to calculate area of rectangle using single inheritance in java.
package single_inheritance;
import java.util.Scanner;
class Rectangle_area {
	int length;
	int breadth;
	public void getDimensions() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length: ");
	length=sc.nextInt();
	System.out.println("enter the breadth: ");
	breadth=sc.nextInt();
	}
	
 }
class Area extends Rectangle_area{
	public void displayArea()
	{
		int area=length*breadth;
		System.out.println("Area of the rectangle: "+area);
	}
}
public class Rectangle{
	public static void main(String[] args) {
	    Area a=new Area();
	    a.getDimensions();
	    a.displayArea();
 
	}

}
