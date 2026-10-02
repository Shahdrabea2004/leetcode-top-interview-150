/**
 * LeetCode 28 - Find the Index of the First Occurrence in a String
 * Problem:
 * https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
 */
public class FindIndexOfFirstOccurrence {
    public int strStr(String haystack, String needle) {
        if (!(haystack.contains(needle))) {
            return -1;
        }
        int n = needle.length();
        int ans = 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (i + n <= haystack.length()) {
                String s = haystack.substring(i, i + n);

                if (s.equals(needle)) {
                    ans = i;
                    break;
                }
            }
        }
        return ans;
    }
}
