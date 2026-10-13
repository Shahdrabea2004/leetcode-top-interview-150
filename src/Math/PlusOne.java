package Math;

import java.util.Arrays;

/**
 * LeetCode 66 - Plus One
 * Problem:
 * https://leetcode.com/problems/plus-one/
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        boolean allEqualNine = true;
        int size = digits.length;
        for (int i = 0; i < size; i++) {
            if (digits[i] != 9) {
                allEqualNine = false;
                break;
            }
        }
        if (allEqualNine) {
            digits = Arrays.copyOf(digits, size + 1);
            Arrays.fill(digits, 0);
            digits[0] = 1;
            return digits;
        }
        if (digits[size - 1] == 9) {
            for (int i = size - 1; i >= 0; i--) {
                if (digits[i - 1] == 9) {
                    digits[i] = 0;
                } else {
                    digits[i] = 0;
                    digits[i - 1]++;
                    break;
                }
            }
            return digits;
        }

        digits[size - 1]++;

        return digits;
    }

    public static void main(String[] args) {
        int[] digits = {9, 9, 1, 9};
        PlusOne plusOne = new PlusOne();
        System.out.println(Arrays.toString(plusOne.plusOne(digits)));
    }
}
