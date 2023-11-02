package LMS2;

public class StringAssignment2 
{
	public static void main(String[] args) 
	{
		 // Create a StringBuffer
        StringBuffer stringBuffer = new StringBuffer("This is StringBuffer");

        // 1. Add the string "- This is a sample program" to the existing string
        stringBuffer.append("- This is a sample program");
        System.out.println("After appending: " + stringBuffer);

        // 2. Insert the string "Object" at the 21st position
        stringBuffer.insert(20, "Object ");
        System.out.println("After inserting 'Object': " + stringBuffer);

        // 3. Reverse the entire string
        stringBuffer.reverse();
        System.out.println("After reversing: " + stringBuffer);
        stringBuffer.reverse();
        System.out.println("After reversing: " + stringBuffer);

        // 4. Replace the word "Buffer" with "Builder"
        stringBuffer.replace(14, 20, "Builder");
        System.out.println("After replacing 'Buffer' with 'Builder': " + stringBuffer);
	}
}
