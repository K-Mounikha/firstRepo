
package multilevel_inheritance;
class Shape
{
	public void draw() {
		System.out.println("Draw method is executed"); 
	}
}
class Circle extends Shape
{
	public void drawCircle()
	{
		System.out.println("DrawCircle method is executed");
	}
}
class ColouredCircle extends Circle
{
	public void setColour(String colour)
	{
		System.out.println("colour of the circle is: "+colour);
	}
}
public class MultiLevel_shape {

	public static void main(String[] args) {
		ColouredCircle c=new ColouredCircle();
		c.draw();
		c.drawCircle();
		c.setColour("Black");

	}

}
