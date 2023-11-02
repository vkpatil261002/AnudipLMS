package LMS2;

import java.util.ArrayList;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}

public class CollectionAssignment3 
{
    public static void main(String[] args) {
        // Create an ArrayList to store Person objects
        ArrayList<Person> personList = new ArrayList<>();

        // Add 10 Person objects to the ArrayList
        personList.add(new Person("Alice", 30));
        personList.add(new Person("Bob", 25));
        personList.add(new Person("Charlie", 40));
        personList.add(new Person("David", 22));
        personList.add(new Person("Eve", 28));
        personList.add(new Person("Frank", 35));
        personList.add(new Person("Grace", 42));
        personList.add(new Person("Hannah", 29));
        personList.add(new Person("Isabel", 33));
        personList.add(new Person("Jack", 27));

        // Print the Person objects using a forEach loop
        personList.forEach(person -> System.out.println(person));
    }
}