package Two_Pointers;

/**
 * LeetCode 125 - Valid Palindrome
 * Problem:
 * https://leetcode.com/problems/valid-palindrome/
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String str1 = "", str2 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(s.length() - 1 - i);
            if (Character.isLetterOrDigit(ch1)) {
                str1 += ch1;
            }
            if (Character.isLetterOrDigit(ch2)) {
                str2 += ch2;
            }
        }

        return ((str1.toLowerCase().equals(str2.toLowerCase())) ? true : false);
    }

    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        System.out.println(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
