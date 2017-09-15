package linearlist.array;

/**
 * Created by wangchenyi on 2017/8/11.
 */
public class RemoveDuplicatesfromSortedArray {

    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1)
            return nums.length;
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[index])
                nums[++index] = nums[i];
        }
        return index + 1;
    }

}
