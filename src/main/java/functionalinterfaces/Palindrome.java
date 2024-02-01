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

    public static void main(String[] args) {
        int num = 45654; // Number to be checked for palindrome property

        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
}
