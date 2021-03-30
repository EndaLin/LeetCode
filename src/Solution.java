import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author linwt
 * @date 2019/12/12 11:17
 */
public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int ans = 0;
        for (List<Integer> row: triangle) {
            Collections.sort(row);
            ans += row.get(0);
        }
        return ans;
    }
}
