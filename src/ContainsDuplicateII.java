import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/**
 * LeetCode 219 - Contains Duplicate II
 * Problem:
 * https://leetcode.com/problems/contains-duplicate-ii/
 */
public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, List<Integer>> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            mp.putIfAbsent(nums[i], new ArrayList<>());
            mp.get(nums[i]).add(i);
        }
        for (Integer x : mp.keySet()) {
            if (mp.get(x).size() >= 2) {
                int s = mp.get(x).size();
                for (int i = 0; i < s; i++) {
                    int val1 = mp.get(x).get(i);
                    for (int j = i + 1; j < s; j++) {
                        int val2 = mp.get(x).get(j);
                        if (Math.abs(val1 - val2) <= k) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean containsNearbyDuplicateMoreOptimize(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (mp.containsKey(nums[i])) {
                if (i - mp.get(nums[i]) <= k) {
                    return true;
                }
            }

            mp.put(nums[i], i);
        }

        return false;
    }
}
