package functionalinterfaces;
import java.util.HashMap;
public class UniqueWordCounter {
    public static int countUniqueWords(String input) {
        // Create a HashMap to store word counts
        HashMap<String, Integer> wordCounts = new HashMap<>();

        // Split the input string into words
        String[] words = input.split("\\s+");

        // Count the occurrences of each word
        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        // Count the number of unique words
        int uniqueCount = wordCounts.size();

        return uniqueCount;
    }
}
