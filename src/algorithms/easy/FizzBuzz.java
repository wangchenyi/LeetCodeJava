package algorithms.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 套路：取余；
 * 当条件变成：3 ---> "Fizz" , 5 ---> "Buzz", 7 ---> "Jazz"时，通过责任链依次判断整除3/5/7的方式，防止判断条件膨胀
 */

public class FizzBuzz {

    public List<String> fizzBuzz(int n) {
        List<String> l = new ArrayList<>();
        for(int i = 1; i <= n; i ++) {
            if (i % 3 == 0 && i % 5 ==0) {
                l.add("FizzBuzz");
            } else if (i % 3 == 0) {
                l.add("Fizz");
            } else if (i % 5 == 0) {
                l.add("Buzz");
            } else {
                l.add(String.valueOf(i));
            }
        }
        return l;
    }

}
