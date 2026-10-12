package Hashmap;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * LeetCode 1 - Two Sum
 * Problem:
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();


        for (int i = 0; i < nums.length; i++) {
            numbers.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (numbers.containsKey(diff) && i != numbers.get(diff)) {
                result.add(i);
                result.add(numbers.get(diff));
                break;
            }
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        TwoSum twoSum = new TwoSum();
        int[] res = twoSum.twoSum(nums, target);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i] + " ");
        }
    }
}
