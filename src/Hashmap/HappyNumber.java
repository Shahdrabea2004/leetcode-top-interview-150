package Hashmap;

import java.util.HashSet;

/**
 * LeetCode 202 - Happy Number
 * Problem:
 * https://leetcode.com/problems/happy-number/
 */
public class HappyNumber {
    public boolean isHappy(int n) {
        HashSet<Integer> st = new HashSet<>();
        while(true) {
            int sum = 0;
            while (n != 0) {
                int d = n % 10;
                sum += Math.pow(d,2);
                n /= 10;
            }
            if (st.contains(sum)) {
                return false;
            }
            if (sum == 1) {
                return true;
            }
            st.add(sum);
            n = sum;
        }
    }

    public static void main(String[] args) {
        HappyNumber happyNumber = new HappyNumber();
        System.out.println(happyNumber.isHappy(1));
    }
}
