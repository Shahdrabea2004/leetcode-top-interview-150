import java.util.Stack;

/**
 * LeetCode 20 - Valid Parentheses
 * Problem:
 * https://leetcode.com/problems/valid-parentheses
 *
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (Character ch : s.toCharArray()) {
            if (st.empty()) {
                st.push(ch);
                continue;
            }
            if (st.peek() == '(' && ch == ')'
                    || st.peek() == '[' && ch == ']'
                    || st.peek() == '{' && ch == '}') {
                st.pop();
            } else {
                st.push(ch);
            }
        }
        return (st.empty());
    }
}
