package linearlist.array;


/**
 * Created by wangchenyi on 2017/8/15.
 */
public class MedianofTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total = nums1.length + nums2.length;
        if (total % 2 == 1)
            return findKth(nums1, nums2, total / 2 + 1);
        else
            return (findKth(nums1, nums2, total / 2 + 1) + findKth(nums1, nums2, total / 2)) / 2;
    }

    private double findKth(int[] nums1, int[] nums2, int k) {
        if (nums1.length > nums2.length)
            return findKth(nums2, nums1, k);
        if (nums1.length == 0)
            return nums2[k - 1];
        if (k == 1)
            return Math.min(nums1[0], nums2[0]);

        int pos1 = Math.min(k / 2, nums1.length);
        int pos2 = k - pos1;

        if (nums1[pos1 - 1] == nums2[pos2 - 1])
            return nums1[pos1 - 1];
        if (nums1[pos1 - 1] < nums2[pos2 - 1]) {
            int[] dest = new int[nums1.length - pos1];
            System.arraycopy(nums1, pos1, dest, 0, nums1.length - pos1);
            return findKth(dest, nums2, k - pos1);
        } else {
            int[] dest = new int[nums2.length - pos2];
            System.arraycopy(nums2, pos2, dest, 0, nums2.length - pos2);
            return findKth(nums1, dest, k - pos2);
        }
    }
}
