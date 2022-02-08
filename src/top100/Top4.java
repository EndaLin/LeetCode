package top100;

/**
 * @author linwentao
 * @date 2022/2/8 7:02 PM
 */
public class Top4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // 当前步长
        int stepSize = 0;
        // 计算中位数的步长Limit
        // 奇数位和偶数位的步长Limit都是一致的
        int stepSizeLimit = (nums1.length + nums2.length) / 2 + 1;

        int preNum = 0, curNum = 0;
        int index1 = 0, index2 = 0;
        while (index1 < nums1.length && index2 < nums2.length && stepSize < stepSizeLimit) {
            preNum = curNum;
            // 从小到大
            if (nums1[index1] <= nums2[index2]) {
                curNum = nums1[index1++];
            } else {
                curNum = nums2[index2++];
            }
            stepSize++;
        }

        // 如果num1没走完
        while (stepSize < stepSizeLimit && index1 < nums1.length) {
            preNum = curNum;
            curNum = nums1[index1++];
            stepSize++;
        }

        // 如果num2没走完
        while (stepSize < stepSizeLimit && index2 < nums2.length) {
            preNum = curNum;
            curNum = nums2[index2++];
            stepSize++;
        }

        return (nums1.length + nums2.length) % 2 == 0 ? (preNum + curNum) * 1.0 / 2 : curNum;
    }
}
