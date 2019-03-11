package project.algorithm.Metamorphic_jumping_step;

/**
 * @author wt
 * @create 2019-03-11 下午9:22
 */
public class Main {
    public int JumpFloorII(int target) {
        if (target <= 0) return 0;
        else if (target == 1) return 1;
        else return 2 * JumpFloorII(target - 1);
    }
}
