package linearlist.array;

/**
 * Created by wangchenyi on 2017/9/4.
 */
public class Combination {
    public static void main(String[] args)
    {
        char[] ch = {'a', 'b', 'c', 'd', 'e'};
        boolean[] bool = new boolean[ch.length];


        combinat(ch, 3  , bool, 0);
    }

    public static void combinat(char[] ch, int num, boolean[] bool, int start)
    {
        if(num == 0)
        {
            for(int i = 0; i < start; i ++)
            {
                if(bool[i] == true)
                    System.out.print(ch[i]);
            }
            System.out.println();
            return;
        }


        if(start == ch.length)
        {
            return;
        }


        bool[start] = true;
        combinat(ch, num - 1, bool, start + 1);


        bool[start] = false;
        combinat(ch, num, bool, start + 1);
    }
}