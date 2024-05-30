//.Write a program to print which one is Greater than (Area/Perimeter)?
package assignment3;

public class Greater_area_perimeter {

	public static void main(String[] args) {
	int length=10;
	int breadth=20;
	int area=length*breadth;
	int perimeter=2*(length+breadth);
	System.out.println("Area:" +area);
	System.out.println("perimeter: "+perimeter);
	if(area>perimeter) {
		System.out.println("area is greater than perimeter");
	}else if(area<perimeter) {
		System.out.println("perimeter is greater than area");
	}
	else {
		System.out.println("both are equal");
	}

	}

}
