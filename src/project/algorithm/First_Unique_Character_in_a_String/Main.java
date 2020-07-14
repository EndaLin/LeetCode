package project.algorithm.First_Unique_Character_in_a_String;

/**
 * @author wt
 * @create 2019-03-10 上午9:33
 */
public class Main {
    public static int firstUniqChar(String s) {
        for(int i = 0;i < s.length();i++) {
            char c = s.charAt(i);
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));
    }
}
