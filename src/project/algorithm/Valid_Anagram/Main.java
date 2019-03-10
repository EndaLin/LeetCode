package project.algorithm.Valid_Anagram;

/**
 * @author wt
 * @create 2019-03-10 上午9:42
 */
public class Main {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int n = 26;
        int[] ans = new int[n];
        for (char c : s.toCharArray()) {
            ans[c % n] ++;
        }
        for (char c : t.toCharArray()) {
            ans[c % n] --;
            if (ans[c % n] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagramz";
        String t = "car";
        System.out.println(isAnagram(s, t));
    }
}
