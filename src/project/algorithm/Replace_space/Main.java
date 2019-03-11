package project.algorithm.Replace_space;

/**
 * @author wt
 * @create 2019-03-11 下午8:39
 */
public class Main {
    public static String replaceSpace(StringBuffer str) {
        return str.toString().replaceAll("\\s", "%20");
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace(new StringBuffer("We%20Are%20Happy")));
    }
}
