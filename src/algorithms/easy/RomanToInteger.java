package algorithms.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 套路：从后向前
 */

public class RomanToInteger {

    public int romanToInt(String s) {
        Map<Character, Integer> dict = new HashMap<Character, Integer>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

        if (s.length() == 1) return dict.get(s.charAt(0));

        int larger = dict.get(s.charAt(s.length() - 1));
        int sum = larger;
        for (int index = s.length() - 2; index >= 0; index--) {
           if( dict.get(s.charAt(index)) >= larger) {
               sum += dict.get(s.charAt(index));
               larger = dict.get(s.charAt(index));
           } else {
               sum -= dict.get(s.charAt(index));
           }
        }
        return sum;
    }

    public static void main(String[] args) {
        RomanToInteger ri = new RomanToInteger();
        System.out.println(ri.romanToInt("IX"));
    }

}
