package lambdas;

import java.util.Arrays;

public class VowelCounter {
    public static void main(String[] args) {
        String[] strings = {"hello", "world", "apple", "banana", "kiwi"};

        Arrays.stream(strings)
                .filter(str -> containsVowels(str))
                .forEach(str -> {
                    int vowelCount = countVowels(str);
                    System.out.println("String: " + str + ", Vowel Count: " + vowelCount);
                });
    }

    public static boolean containsVowels(String str) {
        return str.toLowerCase().matches(".*[aeiou].*");
    }

    public static int countVowels(String str) {
        return (int) str.toLowerCase().chars().filter(ch -> "aeiou".indexOf(ch) != -1).count();
    }
}
