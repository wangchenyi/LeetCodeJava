package test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangchenyi on 2017/8/3.
 */
public class Test1 {


    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        System.out.println(list.get(0));
        list.add(0,3);

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i));
        }




    }
}
