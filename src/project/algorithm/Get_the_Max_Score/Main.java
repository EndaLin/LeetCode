package project.algorithm.Get_the_Max_Score;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static long find(long k, long[] nums) {
        long ans = 0;
        Arrays.sort(nums);
        for (int i = 25; i >= 0 && k != 0; i--) {
            if (k > nums[i]) {
                ans += nums[i] * nums[i];
                k -= nums[i];
            } else {
                ans += k * k;
                k = 0;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        long n, k;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            long[] nums = new long[26];
            String[] number = scanner.nextLine().split(" ");
            n = Long.parseLong(number[0]);
            k = Long.parseLong(number[1]);
            String line = scanner.nextLine();
            char[] chars = line.toCharArray();
            for (int i = 0; i < n; i++) {
                nums[chars[i] - 65]++;
            }
            System.out.println(find(k, nums));
        }
    }
}
