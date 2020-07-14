package project.data_structure.Stack.Min_Stack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wt
 * @create 2019-04-07 下午5:53
 */
public class MinStack {

    private List<Integer> nums;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        nums = new ArrayList<>();
    }

    public void push(int x) {
        nums.add(x);
    }

    public void pop() {
        nums.remove(nums.size() - 1);
    }

    public int top() {
        return nums.get(nums.size() - 1);
    }

    public int getMin() {
        int min = 0;
        for (int i = 1; i < nums.size(); i++) {
            min = nums.get(min) > nums.get(i) ? i : min;
        }
        int value = nums.get(min);
        return value;
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }
}
