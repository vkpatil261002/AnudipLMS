package LMS2;

import java.util.HashMap;

public class CollectionAssignment2 
{
    public static void main(String[] args) 
    {
        // Create a HashMap with String keys and values
        HashMap<String, String> hashMap = new HashMap<>();

        // Add elements to the HashMap
        hashMap.put("one", "first");
        hashMap.put("two", "second");
        hashMap.put("three", "third");
        hashMap.put("four", "fourth");

        // Print the HashMap
        System.out.println("HashMap: " + hashMap);

        // Access values by keys
        String value = hashMap.get("two");
        System.out.println("The value for key 'two' is: " + value);
    }
}
