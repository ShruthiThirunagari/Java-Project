package lambdas;

import java.util.Arrays;
public class AverageOfSquaresOfOddNumbers {
        public static double averageOfSquaresOfOddNumbers(int[] numbers) {
            return Arrays.stream(numbers)                 // Step 1: Create a stream from the array
                    .filter(n -> n % 2 != 0)              // Step 2: Filter out odd numbers
                    .mapToDouble(n -> n * n)              // Step 3: Square each odd number
                    .average()                            // Step 4: Calculate the average
                    .orElse(0);                           // Handle the case where there are no odd numbers
        }

}
