package functionalinterfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RepeatedCharacters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Call method to identify and print repeated characters
        printRepeatedCharacters(str);

        scanner.close();
    }

    public static void printRepeatedCharacters(String str) {
        // Create a HashMap to store characters and their frequencies
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Convert the string to lowercase to treat uppercase and lowercase characters as same
        str = str.toLowerCase();

        // Iterate through each character of the string
        for (char ch : str.toCharArray()) {
            // If character is not a space
            if (ch != ' ') {
                // If character already exists in the map, increment its frequency
                if (charCountMap.containsKey(ch)) {
                    charCountMap.put(ch, charCountMap.get(ch) + 1);
                } else {
                    // Otherwise, add character to map with frequency 1
                    charCountMap.put(ch, 1);
                }
            }
        }

        // Iterate through the map to print repeated characters
        System.out.println("Repeated characters in the string:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
            }
        }
    }
}
