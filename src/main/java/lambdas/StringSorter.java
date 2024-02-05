package lambdas;

import java.util.Arrays;
public class StringSorter {
    public static void sortStrings(String[] strings) {
            Arrays.sort(strings, (s1, s2) -> {
                if (s1.length() != s2.length()) {
                    return s1.length() - s2.length();
                } else {
                    return s2.charAt(s2.length() - 1) - s1.charAt(s1.length() - 1);
                }
            });
    }

    public static void main(String[] args) {
            String[] strings = {"apple", "banana", "orange", "pear", "grape"};
            sortStrings(strings);
            System.out.println(Arrays.toString(strings));
    }
}


