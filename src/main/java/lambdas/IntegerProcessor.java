package lambdas;

import java.util.List;
import java.util.stream.Collectors;

public class IntegerProcessor {

    public static List<Integer> filterAndDoubleEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0) // Filter out even numbers
                .map(n -> n * 2)         // Double each remaining number
                .collect(Collectors.toList());
    }
}

