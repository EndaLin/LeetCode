package project.algorithm.Jumping_stairs;

/**
 * @author wt
 * @create 2019-03-11 下午9:03
 */
public class Main {
    public int JumpFloor(int target) {
        if (target <= 0) return 0;
        else if (target == 1) return 1;
        else if (target == 2) return 2;
        else return JumpFloor(target - 1) + JumpFloor(target - 2);
    }

    public static void main(String[] args) {

    }
}
