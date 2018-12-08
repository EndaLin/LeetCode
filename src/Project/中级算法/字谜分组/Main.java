package Project.中级算法.字谜分组;

import java.util.*;

public class Main {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();
        for(int i = 0;i < strs.length;i++) {
            char[] str = strs[i].toCharArray();
            Arrays.sort(str);
            String temp = new String(str);
            if(!ans.containsKey(temp)) {
                ans.put(temp, new ArrayList<>());
                ans.get(temp).add(strs[i]);
            } else {
                ans.get(temp).add(strs[i]);
            }
        }
        List<List<String>> lists = new ArrayList<>();
        Object[] data = ans.keySet().toArray();
        for(int i = 0;i < data.length;i++){
            lists.add(ans.get(data[i]));
        }
        return lists;
    }
}
