package functionalinterfaces;
import static org.junit.Assert.*;
import org.junit.Test;
public class PalindromeTest {

    @Test
    public void testPalindrome(){
        assertTrue(Palindrome.isPalindrome(89098));
        assertTrue(Palindrome.isPalindrome(45654));
        assertFalse(Palindrome.isPalindrome(12389));

    }

}
