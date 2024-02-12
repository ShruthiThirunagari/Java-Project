package lists;

import java.util.ArrayList;

public class ArrayListTraversal {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // Using traditional for loop
        System.out.println("Traversing using traditional for loop:");
        for (int i = 0; i < list.size(); i++) {
            String element = list.get(i);
            System.out.println(element);
        }

        // Using enhanced for loop (for-each loop)
        System.out.println("\nTraversing using enhanced for loop:");
        for (String element : list) {
            System.out.println(element);
        }
    }
}

