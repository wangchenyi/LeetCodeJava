package linearlist.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangchenyi on 2017/8/16.
 */
public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], false);
        }
        int length = 0;

        for (Integer key : map.keySet()) {
            if(map.get(key)) continue;

            int count = 1;
            map.put(key, true);
            for (int j = key + 1; map.get(j) != null; j++) {
                map.put(j, true);
                count++;
            }
            for (int j = key - 1; map.get(j) != null; j--) {
                map.put(j, true);
                count++;
            }
            length = Math.max(length, count);
        }
        return length;
    }

}
