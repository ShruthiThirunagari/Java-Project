package lambdas;

import java.util.List;

public class SumOfSquares {

    public static int sumOfSquares(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n > 0)           // Filter positive integers
                .mapToInt(n -> n * n)         // Square each integer
                .sum();                       // Sum of squared integers
    }
}

