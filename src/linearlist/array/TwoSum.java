package linearlist.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wangchenyi on 2017/8/16.
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int[] result = new int[2];

        for(int i = 0; i < nums.length; i++){
            if(map.get(nums[i]) == null){
                List<Integer> list = new ArrayList<Integer>();
                list.add(i);
                map.put(nums[i], list);
            } else {
                map.get(nums[i]).add(i);
                //map.put(nums[i], );
            }

        }
        for(int i = 0; i < nums.length; i++){
            int tmp = target - nums[i];
            if(tmp == nums[i] && map.get(nums[i]).size() ==2) {
                result[0] = map.get(nums[i]).get(0);
                result[1] = map.get(nums[i]).get(1);
                break;
            }
            else if(tmp != nums[i] && map.get(tmp) != null){
                result[0] = Math.min(map.get(nums[i]).get(0), map.get(tmp).get(0));
                result[1] = Math.max(map.get(nums[i]).get(0), map.get(tmp).get(0));
                break;
            }
        }
        return result;
    }

    public int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        for (int i=0; i<nums.length ; i++){
            int diff = target - nums[i];
            if (map.containsKey(diff)){
                int index = map.get(diff);
                result[0] = index;
                result[1] = i;
                return result;
            }
            else{
                map.put(nums[i], i);
            }
        }
        return null;
    }

}
