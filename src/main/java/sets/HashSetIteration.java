package sets;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIteration {
    public static void main(String[] args) {
        // Creating a HashSet of Strings
        HashSet<String> hashSet = new HashSet<>();

        // Adding 10 strings to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Grapes");
        hashSet.add("Pineapple");
        hashSet.add("Watermelon");
        hashSet.add("Strawberry");
        hashSet.add("Mango");
        hashSet.add("Peach");
        hashSet.add("Kiwi");

        // Iterating HashSet using Iterator
        System.out.println("Iterating HashSet using Iterator:");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Iterating HashSet using for loop
        System.out.println("\nIterating HashSet using for loop:");
        for (String str : hashSet) {
            System.out.println(str);
        }

        // Iterating HashSet using enhanced for loop
        System.out.println("\nIterating HashSet using enhanced for loop:");
        hashSet.forEach(System.out::println);
    }
}

