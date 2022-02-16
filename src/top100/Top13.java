package top100;

import java.util.LinkedList;
import java.util.List;

/**
 * @author linwentao
 * @date 2022/2/16 7:43 PM
 */
public class Top13 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new LinkedList<>();
        dfs(result, 0, 0, n, "");
        return result;
    }

    private void dfs(List<String> result, int left, int right, int n, String str) {
        if (left == n && right == n) {
            result.add(str);
        }

        if (left <= n) dfs(result, left + 1, right, n, str + "(");
        if (right <= n && right < left) dfs(result, left, right + 1, n, str + ")");
    }

    public static void main(String[] args) {
        List<String> result = new Top13().generateParenthesis(3);
        for (String s : result) {
            System.out.println(s);
        }
    }
}
