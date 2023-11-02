package LMS;

class Person
{
	private String name;
	private int age;
	Person(String n,int a)
	{
		this.name=n;
		this.age=a;
	}
	void Speak()
	{
		System.out.println("Name:"+ name +"\nAge:"+ age);
	}
}
class Student extends Person
{
	private char grade;
	Student(String n,int a,char g)
	{
		super(n,a);// Call the constructor of the superclass (Person)
		this.grade=g;
	}
	void Study()
	{
		System.out.println("Grade:"+ grade);
	}
}
public class InheritenceMain2 
{
	public static void main(String[] args) 
	{	
		Student obj = new Student("Vaibhav",21,'A');
		obj.Speak();
		obj.Study();
	}
}
