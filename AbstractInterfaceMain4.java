package LMS;

interface Person
{
	abstract void speak();
}

class Student implements Person
{
	private String name;
	Student(String n)
	{
		this.name=n;
	}
	public void speak()
	{
		System.out.println("Student "+ name +" says: Hello sir Good Morning!");
	}
}

class Teacher implements Person
{
	private String name;
	Teacher(String n)
	{
		this.name=n;
	}
	public void speak()
	{
		System.out.println("Teacher "+ name +" says: Good Morning Everyone!");
	}
}
public class AbstractInterfaceMain4 
	{
	public static void main(String[] args) 
	{
		Student obj = new Student(" Oggy ");
		Teacher obj1 = new Teacher(" Bob ");
		obj.speak();
		obj1.speak();
	}
}
