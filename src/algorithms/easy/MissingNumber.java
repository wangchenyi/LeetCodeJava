package algorithms.easy;

/**
 * 套路：数学/和与最大值
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i] + 1;
            if (nums[i] + 1 > max) {
                max = nums[i] + 1;
            }
        }
        int diff = (max * (max + 1)) / 2 - sum;
        if(diff == 0) {
            return nums.length;
        } else {
            return diff - 1;
        }
    }
}
