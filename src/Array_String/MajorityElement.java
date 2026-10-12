package Array_String;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 169 - Majority Element
 * Problem:
 * https://leetcode.com/problems/majority-element/
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }
        int mx = Collections.max(mp.entrySet(), Map.Entry.comparingByValue()).getKey();
        return mx;
    }

    public static void main(String[] args) {
        int[] res = {2, 2, 1, 1, 1, 1, 1};
        MajorityElement majorityElement = new MajorityElement();
        int ans = majorityElement.majorityElement(res);
        System.out.println(ans);
    }
}
