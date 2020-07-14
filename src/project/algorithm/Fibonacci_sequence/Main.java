package project.algorithm.Fibonacci_sequence;

/**
 * @author wt
 * @create 2019-03-11 下午8:51
 */
public class Main {

    public static int Fibonacci(int n) {
        if (n < 0) return 0;
        if (n == 0) return 0;
        if (n == 1) return 1;
        else return Fibonacci(n - 1) + Fibonacci (n - 2);
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci(14));
    }
}
