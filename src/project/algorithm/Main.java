package project.algorithm;

/**
 * @Author: wt
 * @Date: 2019/4/14 10:47
 */
public class Main {
    public boolean divisorGame(int N) {
        return N % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(new Main().divisorGame(3));
    }
}
