package functionalinterfaces;

// Method to check if a number is a palindrome
public class Palindrome {
    public static boolean isPalindrome(int num) {
        int originalNumber = num;
        int reversedNumber = 0;

        // Reverse the number
        while (num != 0) {
            int digit = num % 10;
            reversedNumber = reversedNumber * 10 + digit;
            num /= 10;
        }

        // Check if the original number is equal to the reversed number
        return originalNumber == reversedNumber;
    }


}

