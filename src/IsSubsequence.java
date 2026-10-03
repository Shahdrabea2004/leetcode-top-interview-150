/**
 * LeetCode 392 - Is Subsequence
 * Problem:
 * https://leetcode.com/problems/is-subsequence/
 */
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {

        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            boolean found = false;
            for (int j = k; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    found = true;
                    k = ++j;
                    break;
                }
            }

            if (!found)
                return false;
        }

        return true;
    }
}
