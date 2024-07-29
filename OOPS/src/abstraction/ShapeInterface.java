//5.Implement an interface for a shape, with different subclasses representing different types of shapes.
package abstraction;
interface Shape {
    double calculateArea();
    double calculatePerimeter();
}
class Rectangle implements Shape {
    private double length;
    private double breadth;
    public Rectangle(double length, double breadth) {
        this.length=length;
        this.breadth=breadth;
    }
    public double calculateArea() {
        return length+breadth;
    }
    public double calculatePerimeter() {
        return 2*(length+breadth);
    }
}
class Triangle implements Shape {
    private double base;
    private double height;
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double base, double height, double sideA, double sideB, double sideC) {
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    public double calculateArea() {
        return 0.5*base*height;
    }
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}
public class ShapeInterface {
	public static void main(String[] args) {
        Shape rectangle = new Rectangle(4, 7);
        Shape triangle = new Triangle(3, 4, 3, 4, 5);
        System.out.println("\nRectangle:");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());

        System.out.println("\nTriangle:");
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());

	}

}
