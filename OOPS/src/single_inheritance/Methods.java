/*
 Single inheritance with methods 
             a.	Create base class Shape with method draw ()
             b.	Create derived class circle that inherits from the shape class.
             c.	The Circle class has an additional method draw Circle ().
             d.	The program demonstrates calling both methods from the derived class.
 */
package single_inheritance;
class Shape{
	public void draw() {
		System.out.println("drawing shape");
	}
}
class Circle extends Shape{
	public void drawCircle() {
        System.out.println("Drawing a circle");
    }
}

public class Methods {

	public static void main(String[] args) {
	Circle c=new Circle();
	c.draw();
	c.drawCircle();

	}

}
