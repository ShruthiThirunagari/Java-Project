package lambdas;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CapitalizeandSort {
    public static String[] capitalizeandSort(String[] strings) {
        return Arrays.stream(strings)
                .map(str -> str.substring(0, 1).toUpperCase() + str.substring(1))
                .sorted()
                .toArray(String[]::new);
    }
}
