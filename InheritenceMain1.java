package LMS;

class Vehicle
{
	private String brand,model;
	private int year;
	Vehicle(String b,String m,int y)
	{
		this.brand=b;
		this.model=m;
		this.year=y;
	}
	void drive()
	{
		System.out.println("Brand:"+ brand +"\nModel:"+ model +"\nYear:"+ year);
	}
}

class Car extends Vehicle
{
	private String color;
	Car(String b, String m, int y,String c)
	{
		super(b, m, y);// Call the constructor of the superclass (Vehicle)
		this.color=c;
	}
	
	void honk()
	{
		System.out.println("Color:"+ color);
	}
}

public class InheritenceMain1 
{
	public static void main(String[] args) 
	{
		Car obj = new Car("Mercedes","Benz",1994,"Black");
		obj.drive();// Calls the drive method from the superclass
		obj.honk();// Calls the honk method from the subclass
	}
}
