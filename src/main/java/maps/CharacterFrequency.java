package maps;

import java.util.HashMap;

public class CharacterFrequency {
    public static void main(String[] args) {
        String input = "test string";

        // Creating a HashMap to store character frequencies
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // Counting the occurrences of each character in the string
        for (char c : input.toCharArray()) {
            if (frequencyMap.containsKey(c)) {
                frequencyMap.put(c, frequencyMap.get(c) + 1);
            } else {
                frequencyMap.put(c, 1);
            }
        }

        // Printing the distinct characters along with their counts
        System.out.println("Distinct characters and their frequencies:");
        for (char c : frequencyMap.keySet()) {
            System.out.println(c + "-" + frequencyMap.get(c));
        }
    }
}
