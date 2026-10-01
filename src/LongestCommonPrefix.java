/**
 * LeetCode 14 - Longest Common Prefix
 * Problem:
 * https://leetcode.com/problems/longest-common-prefix/
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        for (int i = 0; i < strs[0].length(); i++) {
            boolean match = true;
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() > i  && (strs[0].charAt(i) == strs[j].charAt(i))) {
                    match = true;
                } else {
                    match = false;
                    break;
                }
            }
            if (match == true) {
                ans += strs[0].charAt(i);
            } else {
                break;
            }
        }

        return ans;
    }
}
