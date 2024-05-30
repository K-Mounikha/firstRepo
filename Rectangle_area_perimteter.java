//Length and breadth of a rectangle are 5 and 7 respectively. Write a program to calculate the area and perimeter of the rectangle.

package assignment1;

public class Rectangle_area_perimteter {

	public static void main(String[] args) {
		int l=5,b=7,area=0,perimeter=0;
        area=l*b;
        perimeter=2*(l+b);
        System.out.println("Area of rectangle:"+area);//35
        System.out.println("Perimeter of rectangle:"+perimeter);//24


	}

}
