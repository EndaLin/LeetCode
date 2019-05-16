package project.algorithm.Plus_One;

public class Main {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (++digits[i] >= 10) {
                digits[i] %= 10;
            } else {
                return digits;
            }
        }
        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        for (int i = 0;i < digits.length;i++) {
            ans[i + 1] = digits[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] digits = {9,9};
        new Main().plusOne(digits);
    }
}
