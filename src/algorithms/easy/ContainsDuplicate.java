package algorithms.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * 套路：HashSet
 */

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length <= 1) {
            return false;
        }
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (s.contains(nums[i])) {
                return true;
            } else {
                s.add(nums[i]);
            }
        }
        return false;
    }
}
