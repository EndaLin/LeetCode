package top100;



import java.util.*;
import java.util.stream.Collectors;

/**
 * @author linwentao
 * @date 2022/2/14 7:35 PM
 */
public class Top9 {

    private static Map<Integer, String> phoneMap = new HashMap<Integer, String>() {{
        put(2, "abc");
        put(3, "def");
        put(4, "ghi");
        put(5, "jkl");
        put(6, "mno");
        put(7, "pqrs");
        put(8, "tuv");
        put(9, "wxyz");
    }};

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (Objects.isNull(digits) || digits.isEmpty()) {
            return result;
        }
        // 数据准备
        int[] offsetArray = new int[digits.length()];
        char[] chars = digits.toCharArray();
        for (int i = 0;i < chars.length;i++) {
            offsetArray[i] = chars[i] - '0';
        }

        combination(offsetArray, 0, result);
        return result.stream().filter(it -> it.length() == digits.length()).collect(Collectors.toList());
    }

    public void combination(int[] offsetArray, int dept, List<String> prefixes) {
        if (dept >= offsetArray.length) {
            return;
        }
        int offset = offsetArray[dept];
        char[] chars = phoneMap.get(offset).toCharArray();

        if (prefixes.isEmpty()) {
            // 数据初始化
            for (char c : chars) {
                prefixes.add(String.valueOf(c));
            }
        } else {
            List<String> temp = new LinkedList<>();
            // 每个前缀都与其进行拼接
            for (String prefix : prefixes) {
                for (char c : chars) {
                    temp.add(prefix + c);
                }
            }
            prefixes.addAll(temp);
        }
         // BFS
        combination(offsetArray, dept + 1, prefixes);
    }
}
