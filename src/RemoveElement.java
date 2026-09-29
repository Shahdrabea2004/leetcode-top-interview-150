/**
 * LeetCode 27 - Remove Element
 * Problem:
 * https://leetcode.com/problems/remove-element/
 */
public class RemoveElement {

    public int removeElement(int[] nums, int val) {

        int l = 0, r = 0, n = nums.length, x = 0, cnt = 0;

        while (r < n) {
            if (nums[l] != val) {
                l++;
                r++;
            } else {
                x = val;
                r++;
                if (r < n) {
                    if (nums[r] != val) {
                        int temp = nums[l];
                        nums[l] = nums[r];
                        nums[r] = temp;
                        l++;
                        x = 0;
                    }
                }

            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] == val) {
                break;
            }
            cnt++;
        }

        return cnt;
    }
}
