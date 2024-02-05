package lambdas;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StringFilterTest {

    @Test
    public void testFilterStringsStartingWithA() {
        List<String> inputStrings = Arrays.asList("Apple", "Banana", "Orange", "Apricot", "Grapes");

        Predicate<String> startsWithA = s -> s.startsWith("A");

        List<String> filteredStrings = StringFilter.filterStringsStartingWithA(inputStrings, startsWithA);

        List<String> expectedFilteredStrings = Arrays.asList("Apple", "Apricot");

        Assert.assertEquals(expectedFilteredStrings, filteredStrings);
    }
}



