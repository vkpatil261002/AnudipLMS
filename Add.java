package LMS;
import java.util.Scanner;		//We can read Statement from user by import Scanner class
public class Add 
{
public static void main(String[] args) {
		Scanner s =new Scanner(System.in);		//Creating Scanner object
		System.out.println("Enter value of a:");
		int a = s.nextInt();
		System.out.println("Enter value of b:");
		int b = s.nextInt();
		int sum = a+b;
		System.out.println("Addition of two numbers is:"+sum);
		s.close();
		}
}
