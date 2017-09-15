package sort;

/**
 * Created by wangchenyi on 2017/7/31.
 */
public class FirstMissingPositive {

    public int firstMissingPositive(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            while (nums[i] != i + 1) {
                if (nums[i] <= 0 || nums[i] > len || nums[i] == nums[nums[i] - 1])
                    break;
                swap(nums, i, nums[i] - 1);
            }
        }

//        for(int i=0; i<len; i++){
//            System.out.print(nums[i]);
//        }

        int res = len + 1;
        for (int i = 0; i < len; i++) {
            if (nums[i] != i + 1) {
                res = i + 1;
                break;
            }
        }
        return res;
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 0};
        int[] arr2 = new int[]{3, 4, -1, 1};
        int[] arr3 = new int[]{1, 2, 2, 1, 3, 1, 0, 4, 0};


        FirstMissingPositive fmp = new FirstMissingPositive();

        System.out.println(fmp.firstMissingPositive(arr1));
        System.out.println(fmp.firstMissingPositive(arr2));
        System.out.println(fmp.firstMissingPositive(arr3));
    }

}
