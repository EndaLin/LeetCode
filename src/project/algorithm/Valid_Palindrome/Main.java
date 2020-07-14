package project.algorithm.Valid_Palindrome;

/**
 * @author wt
 * @create 2019-03-11 上午8:33
 */
public class Main {
    public static boolean isPalindrome(String s) {
        String temp = s.replaceAll("[^a-z0-9A-Z]", "").toLowerCase();
        String reverse = new StringBuffer(temp).reverse().toString();
        return temp.equals(reverse);
    }
    public static void main(String[] args) {

    }
}
