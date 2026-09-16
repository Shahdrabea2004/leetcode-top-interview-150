import java.util.Arrays;

/**
 * LeetCode 88 - Merge Sorted Array
 * Problem:
 * https://leetcode.com/problems/merge-sorted-array/
 */
class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            for (int i = 0; i < nums1.length; i++) {
                System.out.println(nums1[i] + " ");
            }
            return;
        }
        if (m == 0) {
            for (int i = 0; i < nums2.length; i++) {
                nums1[i] = nums2[i];
            }
            for (int i = 0; i < nums1.length; i++) {
                System.out.println(nums1[i] + " ");
            }
            return;
        }

        for (int i = m; i < (n + m); i++) {
            nums1[i] = nums2[i - m];
        }
        Arrays.sort(nums1);
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i] + " ");
        }
    }

}