package algorithms.easy;

import classic.HeapSort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {

    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (int n: nums) {
            counter.put(n, counter.getOrDefault(n, 0) + 1);
        }


        Integer[] res = HeapSort.getTopN(counter.values().toArray(new Integer[counter.size()]), k);
        List<Integer> top = new ArrayList<>();

        for (int x: res) {
            for(Map.Entry<Integer, Integer> en :counter.entrySet()) {
                if(en.getValue() == x) {
                    top.add(en.getKey());
                    counter.remove(en.getKey());
                    break;
                }
            }
        }
        return top;

    }



}
