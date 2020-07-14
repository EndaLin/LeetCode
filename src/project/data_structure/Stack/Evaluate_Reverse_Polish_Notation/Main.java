package project.data_structure.Stack.Evaluate_Reverse_Polish_Notation;

import project.data_structure.sample.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: wt
 * @Date: 2019/4/20 16:40
 */
public class Main {
    public int evalRPN(String[] tokens) {
        List<String> list = new ArrayList<>();
        list.add("+");
        list.add("-");
        list.add("*");
        list.add("/");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (stack.isEmpty()) {
                stack.push(tokens[i]);
            } else {
                if (list.contains(tokens[i])) {
                    String first = stack.pop();
                    String second = stack.pop();
                    String ans = null;
                    switch (tokens[i]) {
                        case "+" : ans = String.valueOf(Integer.parseInt(second) + Integer.parseInt(first));break;
                        case "-" : ans = String.valueOf(Integer.parseInt(second) - Integer.parseInt(first));break;
                        case "*" : ans = String.valueOf(Integer.parseInt(second) * Integer.parseInt(first));break;
                        case "/" : ans = String.valueOf(Integer.parseInt(second) / Integer.parseInt(first));break;
                        default: break;
                    }
                    stack.push(ans);
                } else {
                    stack.push(tokens[i]);
                }
            }
        }
        return Integer.parseInt(stack.pop());
    }

    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};
        new Main().evalRPN(tokens);
    }
}
