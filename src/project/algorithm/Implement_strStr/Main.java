package project.algorithm.Implement_strStr;

public class Main {
    public static void getNext(String needle, int[] next) {
        int j = 1, k = 0;
        if (next.length == 1) {
            next[0] = 0;
            return;
        }
        next[0] = -1;
        next[1] = 0;
        while (j < next.length - 1) {
            if (needle.charAt(k) == needle.charAt(j)) {
                next[++j] = ++k;
            } else if (k == 0) {
                next[++j] = 0;
            } else k = next[k];
        }
    }

    public static int KMPindex(String haystack, int start, String needle, int[] next) {
        int i = start, j = 0;
        while (i < haystack.length() && j < next.length) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            } else if (j == 0) i++;
            else j = next[j];
        }
        if (j == needle.length()) {
            return i - needle.length();
        } else {
            return -1;
        }
    }

    public int strStr(String haystack, String needle) {
        if (haystack.isEmpty() && needle.isEmpty()) {
            return 0;
        }
        if (haystack.isEmpty()) {
            return -1;
        }
        if (needle.isEmpty()) {
            return 0;
        }
        int[] next = new int[needle.length()];
        getNext(needle, next);
        return KMPindex(haystack, 0, needle, next);
    }

    public static void main(String[] args) {
        String s = "a";
        String s1 = "a";
        new Main().strStr(s, s1);
    }
}
