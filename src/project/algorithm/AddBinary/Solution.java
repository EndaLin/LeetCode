package project.algorithm.AddBinary;

/**
 * @author linwt
 * @date 2020/6/23 8:29
 */
public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder reverseAnswer = new StringBuilder();
        int maxLength = Math.max(a.length(), b.length());
        int carry = 0;

        for (int i = 0;i < maxLength;i++) {
            carry += i < a.length() ? a.charAt(a.length() - 1 - i) - 48 : 0;
            carry += i < b.length() ? b.charAt(b.length() - 1 - i) - 48 : 0;

            reverseAnswer.append(carry % 2);
            carry /= 2;
        }

        if (carry == 1) {
            reverseAnswer.append(1);
        }
        return reverseAnswer.reverse().toString();
    }

    public static void main(String[] args) {
        new Solution().addBinary("11", "1");
    }
}
