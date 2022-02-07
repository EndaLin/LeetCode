package top100;

/**
 * @author linwentao
 * @date 2022/2/7 6:59 PM
 */
public class Top3 {
    public static int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        if (s.trim().isEmpty()) {
            return 1;
        }

        // 使用bitmap记录字符出现的记录
        int[] bitmap = new int[127];
        char[] chars = s.toCharArray();

        // 指针定义、长度记录
        int start = 0;
        int end = 1;
        int length = 1;

        // 具体逻辑
        bitmap[chars[0]] = 1;
        while (end < s.length()) {
            // 判断当前队列中是否存在重复字符
            // 将队列的起始指针移到重复字符后一位
            if (bitmap[chars[end]] == 1) {
                while (chars[start] != chars[end]) {
                    bitmap[chars[start]] = 0;
                    start++;
                }
                start++;
            }
            bitmap[chars[end]] = 1;
            // 记录当前最长长度
            length = Math.max(length, end - start + 1);
            end ++;
        }

        return length;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("tmmzuxt"));
    }
}
