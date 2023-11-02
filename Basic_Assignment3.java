package LMS;
import java.util.Scanner;
class Student
{
	private String name;
	private int rollno;
	Subject[] subjects;
	Student(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
		this.subjects=new Subject[2];				//used array for collecting subjects data
		subjects[0]=new Subject("Maths");
		subjects[1]=new Subject("English");
	}	
	public String getName()
	{
		return name;
	}
	public int getRollNo()
	{
		return rollno;
	}
	public Subject[] getSubject()
	{
		return subjects;
	}
}

class Subject
{
	private String subjectName;
	private int marks;
	Subject(String subjectName)
	{
		this.subjectName=subjectName;
		this.marks=0;
	}
	public String getSubjectName()
	{
		return subjectName;
	}
	public int getMarks()
	{
		return marks;
	}
	void setMarks(int marks)
	{
		this.marks=marks;
	}
}

class Teacher
{
	public void setMarks(Student student, int[] marks) {
        Subject[] arr = student.getSubject();
        for (int i = 0; i < marks.length; i++) {
            arr[i].setMarks(marks[i]);
        }
    }
	
public double calculateAverageMarks(Student[] students) {
    int totalMarks = 0;
    int numSubjects = students[0].getSubject().length;
    for (Student student : students) {
        Subject[] subjects = student.getSubject();
        for (Subject subject : subjects) {
            totalMarks += subject.getMarks();					//calculates average 
        }
    }
    return (double) totalMarks / (students.length * numSubjects);
}

public void findMinMaxMarks(Student[] students) {
    int minMarks = Integer.MAX_VALUE;
    int maxMarks = Integer.MIN_VALUE;

    for (Student student : students) {
        Subject[] subjects = student.getSubject();
        for (Subject subject : subjects) {
            int marks = subject.getMarks();
            if (marks < minMarks) {
                minMarks = marks;
            }
            if (marks > maxMarks) {
                maxMarks = marks;
            }
        }
    }

    System.out.println("Minimum Marks: " + minMarks);			//Min marks
    System.out.println("Maximum Marks: " + maxMarks);			//Max marks
}
}

public class Basic_Assignment3 {
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[10];

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter the name for Student : ");
            String name = sc.nextLine();
            System.out.println("Enter the roll number for Student : ");
            int rollNumber = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            students[i] = new Student(name, rollNumber);
        }

        Teacher teacher = new Teacher();

        for (Student student : students) {
            int[] marks = new int[2];
            System.out.println("Enter the marks for " + student.getName() + " (Roll Number: " + student.getRollNo() + ")");
            for (int i = 0; i < marks.length; i++) {
                System.out.print("Enter marks for " + student.getSubject()[i].getSubjectName() + ": ");
                marks[i] = sc.nextInt();
            }
            sc.nextLine(); // Consume the newline character
            teacher.setMarks(student, marks);
        }

        double averageMarks = teacher.calculateAverageMarks(students);
        System.out.println("Average Marks: " + averageMarks);

        teacher.findMinMaxMarks(students);

	}

}
