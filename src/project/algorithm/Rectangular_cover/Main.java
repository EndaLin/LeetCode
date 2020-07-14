package project.algorithm.Rectangular_cover;

/**
 * @author wt
 * @create 2019-03-12 上午9:02
 */
public class Main {
    public static int RectCover(int target) {
        if (target == 0) return 0;
        if (target == 1) return 1;
        if (target == 2) return 2;
        return RectCover(target - 1) + RectCover(target - 2);
    }

    public static void main(String[] args) {
        System.out.println(RectCover(4));
    }
}
