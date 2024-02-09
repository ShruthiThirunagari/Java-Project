package strings;

public class CountVowels {
    public static void main(String[] args) {
        String input = "Hello World";
        int vowelCount = countVowels(input);
        System.out.println("Number of vowels in the string: " + vowelCount);
    }

    public static int countVowels(String str) {
        // Convert the string to lowercase to handle both uppercase and lowercase vowels
        str = str.toLowerCase();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Check if the character is a vowel (a, e, i, o, u)
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}
