package LMS2;
public class StringAssignment1 
{
	public static void main(String[] args) 
	{
				String str1="Welcome to java world";
				System.out.println(str1);
				System.out.println(str1.charAt(5));
		        boolean result = str1.toLowerCase().contains("welcome");
		        System.out.println("Contains 'welcome' (ignoring case): " + result);
		        String concatenatedString = str1 + " - Let us learn"; //concatenated string
		        System.out.println(concatenatedString);

		        // Find the position of the first occurrence of 'a'
		        int position = str1.indexOf('a');
		        
		        if (position != -1) {
		            System.out.println("Position of the first 'a': " + position);
		        } else {
		            System.out.println("'a' not found in the string.");
		        }
		     // Replace all occurrences of 'a' with 'e'
		        String replacedString = str1.replace('a', 'e');
		        System.out.println("Modified String: " + replacedString);
		     // Extract the substring between the 4th and 10th positions
		        String extractedSubstring = str1.substring(3, 10);  // Note: 3 is the index of the 4th character
		        System.out.println("Extracted Substring: " + extractedSubstring);
		        // Convert the string to lowercase
		        String lowercaseString = str1.toLowerCase();
		        System.out.println("Lowercase String: " + lowercaseString);
	}
}
