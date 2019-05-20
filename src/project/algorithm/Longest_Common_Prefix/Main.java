package project.algorithm.Longest_Common_Prefix;


public class Main {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        StringBuilder pre = new StringBuilder(strs[0]);
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(pre.toString()) != 0) {
                pre.delete(pre.length() - 1, pre.length());
                if (pre.length() == 0) return "";
            }
        }
        return pre.toString();
    }
}


