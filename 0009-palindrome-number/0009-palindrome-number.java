class Solution {
    public boolean isPalindrome(int num) {
        // Negative numbers are not palindromes
        if (num < 0) {
            return false;
        }

        int originalNum = num;
        int reversedNum = 0;

        while (num != 0) {
            int lastDigit = num % 10;                // Extract the last digit
            reversedNum = reversedNum * 10 + lastDigit; // Append digit to reversed number
            num = num / 10;                          // Remove the last digit
        }

        // Return true if original and reversed numbers match
        return originalNum == reversedNum;
    }
}
