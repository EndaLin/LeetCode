package project.algorithm.First_Bad_Version;

public class Main {
    public boolean isBadVersion(int n) {
        if (n == 5 || n == 4) return true;
        return false;
    }

    public int firstBadVersion(int n) {
        int low = 0;
        int hight = n;
        int minAns = n;
        while (low <= hight) {
            int mid = low + (hight - low) / 2;
            if (isBadVersion(mid)) {
                minAns = mid;
                hight = mid - 1;
            } else low = mid + 1;
        }
        return minAns;
    }

    public static void main(String[] args) {
        new Main().firstBadVersion(5);
    }
}
