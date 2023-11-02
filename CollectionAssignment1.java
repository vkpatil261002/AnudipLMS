package LMS2;

import java.util.HashMap;

public class CollectionAssignment1
{
	 public static void main(String[] args) 
	 {
	        // Create a HashMap with String keys and Integer values
	        HashMap<String, Integer> hashMap = new HashMap<>();

	        // Add key-value pairs to the HashMap
	        hashMap.put("apple", 10);
	        hashMap.put("banana", 5);
	        hashMap.put("cherry", 15);
	        hashMap.put("date", 20);

	        // Print the HashMap
	        System.out.println("HashMap: " + hashMap);

	        // Access values by key
	        int value = hashMap.get("banana");
	        System.out.println("The value for 'banana' is: " + value);
	 }
}
