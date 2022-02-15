package top100;

import java.util.Stack;

/**
 * @author linwentao
 * @date 2022/2/15 7:56 PM
 */
public class Top11 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();

        for (char c : chars) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (stack.isEmpty()) {
                return false;
            } else {
                Character character = stack.pop();
                if (character == '(' && c != ')' || character == '[' && c != ']' || character == '{' && c != '}') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
