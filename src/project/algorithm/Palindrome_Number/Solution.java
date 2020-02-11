package project.algorithm.Palindrome_Number;

/**
 * @author linwt
 * @date 2020/2/11 9:57
 */
public class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        char[] chars = str.toCharArray();
        for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
            if (chars[i] != chars[j]) {
                return false;
            }
        }
        return true;
    }

}
