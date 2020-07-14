package project.algorithm.PatternMatching;

/**
 * @author linwt
 * @date 2020/6/22 9:43
 */
public class Solution {
    public boolean patternMatching(String pattern, String value) {
        int count_a = 0, count_b = 0;

        // 统计pattern 中a和b数量
        for (int i = 0; i < pattern.length(); i++) {
            if (pattern.charAt(i) == 'a') {
                count_a++;
            } else {
                count_b++;
            }
        }

        // 如果a的数量少于b，则进行调换
        if (count_a < count_b) {
            int temp = count_a;
            count_a = count_b;
            count_b = temp;
            char[] array = pattern.toCharArray();
            for (int i = 0; i < array.length; i++) {
                array[i] = array[i] == 'a' ? 'b' : 'a';
            }
            pattern = new String(array);
        }

        if (value.length() == 0) {
            return count_b == 0;
        }

        if (pattern.length() == 0) {
            return false;
        }

        for (int len_a = 0; count_a * len_a <= value.length(); len_a++) {
            int rest = value.length() - count_a * len_a;
            // 满足以下判断条件之一，才能说明len_a 是合理值，但不一定是最终值
            boolean condition1 = count_b == 0 && rest == 0;
            boolean condition2 = count_b != 0 && rest % count_b == 0;
            if (condition1 || condition2) {
                // 计算len_b 长度
                int len_b = count_b == 0 ? 0 : rest / count_b;
                // 初始化指针的位置
                int pos = 0;
                boolean correct = true;
                String value_a = null, value_b = null;
                for (char ch : pattern.toCharArray()) {
                    if (ch == 'a') {
                        String sub = value.substring(pos, pos + len_a);
                        if (value_a == null) {
                            value_a = sub;
                        } else if (!value_a.equals(sub)) {
                            correct = false;
                            break;
                        }
                        pos += len_a;
                    } else {
                        String sub = value.substring(pos, pos + len_b);
                        if (value_b == null) {
                            value_b = sub;
                        } else if (!value_b.equals(sub)) {
                            correct = false;
                            break;
                        }
                        pos += len_b;
                    }
                }

                if (correct) {
                    return true;
                }
            }
        }
        return false;
    }
}
