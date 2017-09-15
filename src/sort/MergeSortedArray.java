package sort;

import com.sun.scenario.effect.Merge;

/**
 * Created by wangchenyi on 2017/7/27.
 */
// 给定两个已排序数组，及其长度m、n。将第二个数组合并到第一个数组，并依然保持有序。
public class MergeSortedArray {

    // 注意，这道题会测试nums1，新创建数组存排序后结果，指针会不一致
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int resCur = m + n - 1;
        int i1 = m - 1;
        int i2 = n - 1;

        while (i1 >= 0 && i2 >= 0){
            nums1[resCur--] = nums1[i1] >= nums2[i2] ? nums1[i1--] : nums2[i2--];
        }
        while (i2 >= 0){
            nums1[resCur--] = nums2[i2--];
        }

        for (int re : nums1) {
            System.out.print(re + " ");
        }

    }

    public static void main(String[] args){
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};
        merge(nums1, 0, nums2, 1);
    }

}
