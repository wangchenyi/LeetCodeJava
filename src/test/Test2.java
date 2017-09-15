package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by wangchenyi on 2017/8/7.
 */
public class Test2 {

    public static void main(String[] args){
        Map<Integer, Boolean> map = new HashMap<>();
        map.put(1, true);
        map.put(10, true);
        map.put(3, true);
        map.put(10, true);

        for (Integer o : map.keySet()) {
            System.out.println(o);
        }
    }

}
