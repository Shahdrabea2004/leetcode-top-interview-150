package Hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 383 - Ransom Note
 * Problem:
 * https://leetcode.com/problems/ransom-note/
 */
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> mp = new HashMap<>();
        for (Character ch : ransomNote.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }
        int cnt = 0;
        for (Character ch : magazine.toCharArray()) {
            if (mp.getOrDefault(ch, 0) > 0) {
                cnt++;
                mp.put(ch, mp.get(ch) - 1);
            }
        }

        return cnt >= ransomNote.length();
    }

    public static void main(String[] args) {
        RansomNote ransomNote = new RansomNote();
        System.out.println(ransomNote.canConstruct("aaac", "aabca"));
    }
}
