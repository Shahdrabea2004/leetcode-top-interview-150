package Math;
/**
 * LeetCode 69 - Sqrt(x)
 * Problem:
 * https://leetcode.com/problems/sqrtx/
 */
public class Sqrt {
    public int mySqrt(int x) {
        int l = 0, r = x, ans = 0, mid = 0;
        while (l <= r) {
            mid = l + (r - l) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Sqrt sqrt = new Sqrt();
        System.out.println(sqrt.mySqrt(4));
    }
}
