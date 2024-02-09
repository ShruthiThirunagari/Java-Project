package objectarrays;

import java.util.HashSet;

public class Main3 {
    public static void main(String[] args) {
        // Create some Person objects
        Person person1 = new Person(170, 70, "123-45-6789", "123-456-7890");
        Person person2 = new Person(160, 60, "987-65-4321", "987-654-3210");
        Person person3 = new Person(175, 75, "123-45-6789", "555-555-5555");

        // Check equality
        System.out.println("person1 equals person2: " + person1.equals(person2)); // Should be false
        System.out.println("person1 equals person3: " + person1.equals(person3)); // Should be true

        // Create a HashSet to store Person objects
        HashSet<Person> personSet = new HashSet<>();
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);

        // Print the contents of the HashSet
        System.out.println("\nContents of the HashSet:");
        for (Person person : personSet) {
            System.out.println(person);
        }
    }
}

