package project.algorithm.Find_the_best_one;

import java.util.Scanner;

public class Main {

    public static boolean find(long[] data, long max, long min) {
        if (data.length == 2 || data.length == 1) {
            return true;
        }
        long temp = (max + min) / 2;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != max && data[i] != min && data[i] != temp) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < k; i++) {
            int n = Integer.parseInt(scanner.nextLine());
            String[] mess = scanner.nextLine().split(" ");
            long[] data = new long[mess.length];
            long min = Integer.MAX_VALUE;
            long max = Integer.MIN_VALUE;
            for (int j = 0;j < mess.length;j++) {
                data[j] = Long.parseLong(mess[j]);
                if (data[j] < min) {
                    min = data[j];
                }
                if (data[j] > max) {
                    max = data[j];
                }
            }
            if (find(data, max, min)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

