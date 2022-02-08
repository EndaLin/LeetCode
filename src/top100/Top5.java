package top100;

/**
 * @author linwentao
 * @date 2022/2/8 7:40 PM
 */
public class Top5 {
    public static String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        char[] chars = s.toCharArray();
        int[][] dp = new int[s.length()][s.length()];
        // 初始化边界数据
        dp[0][1] = chars[0] == chars[1] ? 1 : 0;
        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = 1;
        }
        int maxLength = 0;

        // dp
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = s.length() - 1; i <= j && j >= 0; j--) {
                if (i == j) {
                    // 边界
                    dp[i][j] = 1;
                } else if (i + 1 == j) {
                    // 边界
                    dp[i][j] = chars[i] == chars[j] ? 1 : 0;
                } else {
                    // 状态转移
                    dp[i][j] = dp[i + 1][j - 1] == 1 && chars[i] == chars[j] ? 1 : 0;
                }
                if (dp[i][j] == 1) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }

        // 根据dp结果，提取最长的子串
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (dp[i][j] == 1 && j - i + 1 == maxLength) {
                    return s.substring(i, j + 1);
                }
            }
        }

        // 这里啥也不是
        return s;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
}
