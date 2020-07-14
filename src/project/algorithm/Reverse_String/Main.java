package project.algorithm.Reverse_String;

import java.util.Arrays;

/**
 * @author wt
 * @create 2019-03-09 上午10:25
 */
public class Main {
    public static void reverseString(char[] s) {
        int i, j;
        for (i = 0, j = s.length - 1 - i;i < j;i++, j--) {
            char temp = s[j];
            s[j] = s[i];
            s[i] = temp;
        }
    }

    public static void main(String[] args) {
        char[] s = {'o','l','l','e','h'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }
}
