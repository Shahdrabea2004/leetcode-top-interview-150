package Hashmap;

import java.util.Arrays;

/**
 * LeetCode 242 - Valid Anagram
 * Problem:
 * https://leetcode.com/problems/valid-anagram/
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char[] sC = s.toCharArray();
        Arrays.sort(sC);

        char[] tC = t.toCharArray();
        Arrays.sort(tC);

        return (Arrays.equals(sC, tC));
    }

    public static void main(String[] args) {
        ValidAnagram validAnagram = new ValidAnagram();
        System.out.println(validAnagram.isAnagram("rat", "car"));
    }
}
