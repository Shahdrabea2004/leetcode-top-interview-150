package Hashmap;

import java.util.HashMap;

/**
 * LeetCode 290 - Word Pattern
 * Problem:
 * https://leetcode.com/problems/word-pattern/
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mp = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (mp.containsKey(s.charAt(i))) {
                if(mp.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            } else {
                if (mp.containsValue(t.charAt(i))) {
                    return false;
                }
                mp.put(s.charAt(i), t.charAt(i));
            }
        }

        return true;
    }

    public static void main(String[] args) {
        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();
        System.out.println(isomorphicStrings.isIsomorphic("paper", "title"));
    }
}
