/**
 * LeetCode 9 - Palindrome Number
 * Problem:
 * https://leetcode.com/problems/palindrome-number/
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int reverse = 0, y = x;
        while (x != 0) {
            int d = x % 10;
            reverse = reverse * 10 + d;
            x /= 10;
        }
        return (y == reverse);
    }
}
