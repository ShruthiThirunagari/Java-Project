package lists;

import java.util.ArrayList;

public class RemoveLastElement {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // Printing the ArrayList before removal
        System.out.println("ArrayList before removing the last element: " + list);

        // Removing the last element
        if (!list.isEmpty()) {
            list.remove(list.size() - 1);
            System.out.println("Last element removed.");
        } else {
            System.out.println("ArrayList is already empty. No elements to remove.");
        }

        // Printing the ArrayList after removal
        System.out.println("ArrayList after removing the last element: " + list);
    }
}

