package lists;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        // Converting ArrayList to Array
        String[] array = arrayList.toArray(new String[arrayList.size()]);

        // Printing the elements of the array
        System.out.println("Array elements:");
        for (String element : array) {
            System.out.println(element);
        }
    }
}

