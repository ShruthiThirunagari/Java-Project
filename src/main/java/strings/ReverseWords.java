package strings;

public class ReverseWords {
    public static void main(String[] args) {
        String input = "Java J2EE Reverse Me";
        String output = reverseWords(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }

    public static String reverseWords(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Create a StringBuilder to store the reversed words
        StringBuilder result = new StringBuilder();

        // Iterate through each word and reverse it
        for (String word : words) {
            // Reverse the word
            String reversedWord = reverseString(word);
            // Append the reversed word to the result StringBuilder
            result.append(reversedWord).append(" ");
        }

        // Convert the StringBuilder to a string and trim any trailing spaces
        return result.toString().trim();
    }

    public static String reverseString(String str) {
        // Convert the string to a character array
        char[] charArray = str.toCharArray();

        // Reverse the character array
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        // Convert the character array back to a string
        return new String(charArray);
    }
}

