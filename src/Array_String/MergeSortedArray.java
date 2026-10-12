package Array_String;

import java.util.Arrays;
import java.util.Scanner;

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

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // nums1
        int m = input.nextInt();
        int[] nums1 = new int[m];

        for (int i = 0; i < m; i++) {
            nums1[i] = input.nextInt();
        }

        // n
        int n = input.nextInt();

        // nums2
        int[] nums2 = new int[n];

        for (int i = 0; i < n; i++) {
            nums2[i] = input.nextInt();
        }

        // Create nums1 with size m + n
        int[] newNums1 = new int[m + n];

        for (int i = 0; i < m; i++) {
            newNums1[i] = nums1[i];
        }

        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.merge(newNums1, m, nums2, n);
    }

}