package linearlist.array;

/**
 * Created by wangchenyi on 2017/8/15.
 */
public class SearchinRotatedSortedArray {

    public int search(int[] nums, int target) {
        if(nums.length == 0)
            return -1;
        int lo = 0;
        int hi = nums.length - 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] < nums[i-1]){
                hi = i-1;
                lo = i;
            }
        }
        return search(nums, lo, hi, target);
    }

    public int search(int[] nums, int lo, int hi, int target) {
        if(hi == lo)
            return target == nums[lo]? lo : -1;
        int mid = lo;
        if(hi > lo)
            mid = lo + (hi - lo)/2;
        else if(hi < lo)
            mid = (lo + (hi + nums.length - lo)/2) % nums.length;

        if(target == nums[mid])
            return mid;
        else if(target > nums[mid])
            return search(nums, (mid + 1) % nums.length, hi, target);
        else
            return search(nums, lo, mid, target);
    }

}
