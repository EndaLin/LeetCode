package project.algorithm.Find_the_max;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int ans = 0;
        String[] data = scanner.nextLine().split(" ");
        for (int i = 0;i < n;i++) {
            ans += Integer.parseInt(data[i]) - 1;
        }
        System.out.println(ans);
    }
}
