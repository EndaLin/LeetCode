package project.csp;

import java.util.Scanner;

/**
 * ID: 201903-1
 * 通过率: 95%
 * @author linwt
 * @date 2019/12/3 20:12
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int min = scanner.nextInt();
        double mid = 0;
        int max = 0;
        for (int i = 1; i < n - 1; i++) {
            if (i == (n - 1) / 2) {
                if (n % 2 == 1) {
                    mid = scanner.nextInt();
                } else {
                    int pre = scanner.nextInt();
                    int next = scanner.nextInt();
                    i++;
                    mid = (pre + next) * 1.0 / 2;
                }
            } else {
                scanner.nextInt();
            }
        }
        max = scanner.nextInt();
        if (min > max) {
            int temp = min;
            min = max;
            max = temp;
        }
        if (mid * 2 % 2 == 1)
            System.out.printf("%d %.1f %d", max, mid, min);
        else System.out.printf("%d %.0f %d", max, mid, min);
    }
}
