/*
 3.Write a Java class called Rectangle with private fields for length and width. Create
 a constructor that takes in a length and width as parameters and initializes the fields.
 Also, create a method called calculateArea that returns the area of the rectangle
 (length * width)
 */
package constructor;

public class Rectangle {
	private int length;
	private int width;
	Rectangle(int length,int width)
	{
		this.length=length;
		this.width=width;
	}
	public int calculateArea()
	{
		return length*width;

	}
    public static void main(String[] args) {
    Rectangle r=new Rectangle(10,20);
    int area=r.calculateArea();
    System.out.println("Area of the rectangle: "+area);
    
	}

}
