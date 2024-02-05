package lambdas;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringSorter {
    public static String[] sortStrings(String[] strings) {

        return Stream.of(strings).sorted((s1, s2) -> {
            if (s1.length() != s2.length()) {
                return s1.length() - s2.length();
            } else {
                return Character.compare(s1.charAt(s1.length() - 1),s2.charAt(s2.length() - 1));
            }
        }).toArray(String[]::new);

    }

    public static void main(String[] args) {
            String[] strings = {"apple", "banana", "orange", "pear", "grape"};
            sortStrings(strings);
            System.out.println(Arrays.toString(strings));
    }
}


