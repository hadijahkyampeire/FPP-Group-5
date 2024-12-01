package question4;

public class RecursivePalindrome {
    // Public utility method for the palindrome check
    public static boolean isPalindrome(int num) {
        // -ve numbers not palindromes
        if (num < 0 || (num % 10 == 0 && num != 0)) return false;

        // Start the recursion with the number and an initial reversed number
        return isPalindromeRecursive(num, 0, num);
    }

    // Private recursive method to check palindrome by comparing digits
    private static boolean isPalindromeRecursive(int num, int reversedNum, int originalNum) {
        // Base case: when the number reduces to 0, all digits have been compared
        if (num == 0) {
            return reversedNum == originalNum; // If the reversed number matches the original, it's a palindrome
        }

        // Recursive step: Take the last digit and append it to the reversed number
        int lastDigit = num % 10;
        reversedNum = reversedNum * 10 + lastDigit;

        // Call recursively with the remaining number
        return isPalindromeRecursive(num / 10, reversedNum, originalNum);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));  // true
        System.out.println(isPalindrome(-121)); // false (Negative number)
        System.out.println(isPalindrome(9));  // true (well, a number by itself is a palindrome).
        System.out.println(isPalindrome(102));  // false
    }
}
