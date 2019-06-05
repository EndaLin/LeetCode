package project.data_structure.HeapSort;

public class Main {

    /**
     * @param data 待排序的数组
     * @param n    元素的总个数
     * @param h    当前的根节点
     */
    void createHeap(int[] data, int n, int h) {
        int i = h;
        int j = 2 * i + 1;
        int temp = data[i];

        while (j < n) {

            // 寻找左右子节点的最大值
            if (j + 1 < n && data[j] < data[j + 1]) j++;

            // 对比根节点与左右子节点的最大值
            if (temp > data[j]) {
                break;
            } else {
                data[i] = data[j];
                i = j;
                j = 2 * i + 1;
            }
        }
        data[i] = temp;
    }

    void initHeap(int[] data, int n) {
        for (int i = (n - 2) / 2; i > -1; i--) {
            createHeap(data, n, i);
        }
    }

    void heapSort(int[] data, int n) {
        initHeap(data, n);

        for (int i = n - 1;i > -1;i--) {
            int temp = data[i];
            data[i] = data[0];
            data[0] = temp;
            createHeap(data, i, 0);
        }
    }

    public int[] sortArray(int[] nums) {
        heapSort(nums, nums.length);
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {5,2,3,1};
        int[] ans = new Main().sortArray(nums);
        for (int i = 0;i < nums.length;i++) {
            System.out.println(ans[i] + " ");
        }
    }
}
