import java.util.HashMap;

/**
 * LeetCode 13 - Roman to Integer
 * Problem:
 * https://leetcode.com/problems/roman-to-integer/
 */
public class RomanToInteger {
    public int romanToInt(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        mp.put('I', 1);
        mp.put('V', 5);
        mp.put('X', 10);
        mp.put('L', 50);
        mp.put('C', 100);
        mp.put('D', 500);
        mp.put('M', 1000);
        int res = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (i == 0) {
                res += (mp.get(s.charAt(i)));
                break;
            }
            if ((s.charAt(i) == 'X' || s.charAt(i) == 'V') && s.charAt(i - 1) == 'I') {
                res += (mp.get(s.charAt(i)) - mp.get(s.charAt(i - 1)));
                i--;
            } else if ((s.charAt(i) == 'C' || s.charAt(i) == 'L') && s.charAt(i - 1) == 'X') {
                res += (mp.get(s.charAt(i)) - mp.get(s.charAt(i - 1)));
                i--;
            } else if ((s.charAt(i) == 'M' || s.charAt(i) == 'D') && s.charAt(i - 1) == 'C') {
                res += (mp.get(s.charAt(i)) - mp.get(s.charAt(i - 1)));
                i--;
            } else {
                res += (mp.get(s.charAt(i)));
            }
        }
        return res;

    }
}
