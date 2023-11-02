package LMS;

abstract class Shape
{
	void calculateArea() {
		 // This method is empty in the abstract class and will be overridden in subclasses.
	}
}

class Circle extends Shape
{
	private double radius;
	Circle(double r)
	{
		this.radius=r;
	}
	@Override
	void calculateArea()
	{
		System.out.println("Area of circle is:"+ Math.PI*radius*radius);
	}
}

class Rectangle extends Shape
{
	private int length,breadth,height;
	Rectangle(int l,int b,int h)
	{
		this.length=l;
		this.breadth=b;
		this.height=h;
	}
	@Override
	void calculateArea()
	{
		System.out.println("Area of Rectangle is :"+ length*breadth*height);
	}
}
public class AbstractInterfaceMain1 {

	public static void main(String[] args) {
		
		Circle obj = new Circle(65.443);
		obj.calculateArea();// Calls the overridden calculateArea method in Circle
		
		Rectangle obj1 = new Rectangle(10,15,7);
		obj1.calculateArea();// Calls the overridden calculateArea method in Rectangle
	}
}
