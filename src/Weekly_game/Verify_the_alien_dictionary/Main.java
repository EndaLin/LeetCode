package 周赛.验证外星语词典;

public class Main {
    public static boolean isAlienSorted(String[] words, String order) {
        int length = words.length;
        int length1, length2;
        int i, j;
        int index1, index2;
        char c1, c2;
        if (length <= 1) {
            return true;
        }
        for (i = 1; i < length; i++) {
            length1 = words[i].length();
            length2 = words[i-1].length();
            for (j = 0; j < length1 && j < length2; j++) {
                c1 = words[i-1].charAt(j);
                c2 = words[i].charAt(j);
                index1 = order.indexOf(c1);
                index2 = order.indexOf(c2);
                if(index1 < index2) {
                    break;
                } else if (index1 > index2) {
                    return false;
                }
            }
            if(j == length1 || j == length2) {
                if(length1 < length2) {
                    return false;
                }
            }
        }
        return true;
    }
}
