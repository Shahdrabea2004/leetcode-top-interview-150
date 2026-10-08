import java.util.ArrayList;
import java.util.List;
/**
 * LeetCode 228 - Summary Ranges
 * Problem:
 * https://leetcode.com/problems/summary-ranges/
 *
 */
public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if (nums.length == 0) {
            return res;
        }
        int i = 0, j = 1, n = nums.length;
        while (j < n) {
            if (nums[j] - nums[j - 1] != 1) {
                j--;
                String str;
                if (i == j) {
                    str = nums[i] + "";
                    res.add(str);
                } else {
                    str = nums[i] + "->" + nums[j];
                    res.add(str);

                }
                i = j + 1;
                j = i + 1;
            } else {
                j++;
            }
        }
        j--;
        String str;
        if (i == j) {
            str = nums[i] + "";
            res.add(str);
        } else {
            str = nums[i] + "->" + nums[j];
            res.add(str);

        }
        return res;
    }
}
