package project.algorithm.ReplaceSentence;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author linwt
 * @date 2020/7/9 9:06
 */
public class Solution {
    public int respace(String[] dictionary, String sentence) {
        Set<String> set = new HashSet<>(dictionary.length);
        set.addAll(Arrays.asList(dictionary));

        int[] dp = new int[sentence.length() + 1];
        for (int i = 1; i <= sentence.length(); i++) {
            dp[i] = dp[i - 1] + 1;
            for (int j = 0;j < i;j++) {
                if (set.contains(sentence.substring(j, i))) {
                    dp[i] = Math.min(dp[i], dp[j]);
                }
            }
        }
        return dp[sentence.length()];
    }
}
