package algorithms.easy;
/**
 * 套路：快慢指针
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        for(int i = nums.length -2; i >= 0; i--) {
            if(nums[i] == 0) {
                int j = i + 1;
                while(j < nums.length && nums[j] != 0) {
                    int tmp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = tmp;
                    j++;
                }
            }

        }
    }

    /**  更快的方法！！！ **/
//    public void moveZeroes(int[] nums) {
//        // O(n)
//
//        if (nums == null || nums.length == 0) {
//            return;
//        }
//
//        int index = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                nums[index] = nums[i];
//                index++;
//            }
//        }
//
//        while (index < nums.length) {
//            nums[index++] = 0;
//        }
//    }
}
