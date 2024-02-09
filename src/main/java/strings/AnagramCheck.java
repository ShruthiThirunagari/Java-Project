package strings;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (areAnagrams(str1, str2)) {
            System.out.println("The strings '" + str1 + "' and '" + str2 + "' are anagrams.");
        } else {
            System.out.println("The strings '" + str1 + "' and '" + str2 + "' are not anagrams.");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        // Check if the lengths of the strings are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert the strings to character arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }
}
