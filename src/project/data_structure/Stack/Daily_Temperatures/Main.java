package project.data_structure.Stack.Daily_Temperatures;

import project.data_structure.sample.Stack;

/**
 * @Author: wt
 * @Date: 2019/4/20 15:49
 */
public class Main {
    class Node {
        int index;
        int value;

        public Node(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }
    public int[] dailyTemperatures(int[] T) {
        Stack<Node> stack = new Stack<>();
        int[] ans = new int[T.length];
        for (int i = 0;i < T.length;i++) {
            Node node = new Node(i, T[i]);
            if (stack.isEmpty()) {
                stack.push(node);
            } else {
                Node first = stack.peek();
                while (first.value < node.value) {
                    stack.pop();
                    ans[first.index] = node.index - first.index;
                    if (!stack.isEmpty()) {
                        first = stack.peek();
                    } else {
                        break;
                    }
                }
                stack.push(node);
            }
        }
        return ans;
    }
}
