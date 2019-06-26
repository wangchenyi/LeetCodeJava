package algorithms.easy;

import java.util.LinkedHashMap;

/**
 * 套路：HashMap，使用int[] counter = new int[26]遍历s两遍也可
 */

public class FirstUniqueCharacterInAString {

    public int firstUniqChar(String s) {

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), -1);
            } else {
                map.put(s.charAt(i), i);
            }
        }

        for (Integer index : map.values()) {
            if (index >= 0) {
                return index;
            }
        }
        return -1;

    }
}
