import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] data = new int[N];
        int i = 0;
        int D = 0;
        int[] isDrop = new int[N];
        for (int k = 0; k < N; k++) {
            int M = scanner.nextInt();
            for (int j = 0; j < M; j++) {
                int temp = scanner.nextInt();
                if (temp > 0) {
                    if (data[i] != 0 && data[i] > temp) {
                        D++;
                        isDrop[i] = 1;
                    }
                    data[i] = temp;
                } else {
                    data[i] += temp;
                }
            }
            i++;
        }
        int T = 0;
        for (int k = 0; k < N; k++) {
            T += data[k];
        }
        int E = 0;
        if (N == 3) {
            if (isDrop[0] == 1 && isDrop[(1) % N] == 1 && isDrop[(2) % N] == 1) E++;
        } else if (N > 3) {
            for (int k = 0; k < N; k++) {
                if (isDrop[k] == 1 && isDrop[(k + 1) % N] == 1 && isDrop[(k + 2) % N] == 1) E++;
            }
        }

        System.out.println(T + " " + D + " " + E);
    }
}   
