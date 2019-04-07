package project.data_structure.Stack.Valid_Parentheses;

import project.data_structure.sample.Stack;

/**
 * @author wt
 * @create 2019-04-07 下午6:16
 */
public class Main {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(' || chars[i] == '{' || chars[i] == '[') {
                stack.push(chars[i]);
            } else {
                if (stack.isEmpty()) return false;
                char ch = stack.pop();
                if ((chars[i] == ')' && ch != '(') || (chars[i] == '}' && ch != '{') || (chars[i] == ']' && ch != '[')) {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        new Main().isValid("]");
    }
}
