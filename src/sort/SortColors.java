package sort;

/**
 * Created by wangchenyi on 2017/7/31.
 */
public class SortColors {


    private int partiton(int[] nums, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        while (true) {
            while (nums[++i] <= nums[lo]) if (i == hi) break;
            while (nums[--j] >= nums[lo]) if (j == lo) break;
            if (i >= j)
                break;
            swap(nums, i, j);
        }
        swap(nums, lo, j);
        return j;
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    private void sort(int[] nums, int lo, int hi){
        if(hi <= lo) return;
        int par = partiton(nums, lo, hi);
        sort(nums, lo, par - 1);
        sort(nums, par + 1, hi);
    }

    // 快速排序
    public void sortColors1(int[] nums) {
        sort(nums, 0, nums.length-1);
    }

    // 0与首位交换，2与末尾交换，类似选择排序。效率更高
    public void sortColors2(int[] nums) {
        if(nums == null || nums.length == 0) {
            return;
        }

        int start = 0, end = nums.length-1;
        int i = 0;
        while(i <= end) {
            if(nums[i] == 0) {
                swap(nums,i,start);
                start++;
                i++;
            } else if(nums[i] == 1) {
                i++;
            } else {
                swap(nums,i,end);
                end--;
            }
        }
    }

}
