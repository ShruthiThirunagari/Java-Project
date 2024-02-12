package sets;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "hello world";

        // Remove duplicate characters
        String result = removeDuplicates(input);

        // Print the resulting string
        System.out.println("String after removing duplicates: " + result);
    }

    public static String removeDuplicates(String str) {
        HashSet<Character> set = new HashSet<>();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!set.contains(ch)) {
                set.add(ch);
                builder.append(ch);
            }
        }

        return builder.toString();
    }
}

