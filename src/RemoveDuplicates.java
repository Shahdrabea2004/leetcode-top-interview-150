
/**
 * LeetCode 26 - Remove Duplicates from Sorted Array
 * Problem:
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int cnt = 1;
        int l = 0, r = 1, n = nums.length;

        while (r < n) {
            if (nums[l] == nums[r]) {
                r++;
                continue;
            }
            nums[l + 1] = nums[r];
            l++;
            r++;
            cnt++;

        }

        return cnt;

    }
}
