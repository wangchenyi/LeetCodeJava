package algorithms.easy;

/**
 * 套路：取余取整
 */
public class ReverseInteger {

    public int reverse(int x) {
        if ( x == -1 << 31) return 0;
        char[] arr = String.valueOf(Math.abs(x)).toCharArray();
        long sum = 0L;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.pow(10, i) * Integer.valueOf(String.valueOf(arr[i]));
        }
        sum = x < 0 ? sum * -1 : sum;
        if (sum > 2147483647 || sum < -2147483648) {
            return 0;
        }
        return Integer.valueOf(String.valueOf(sum));
    }

    public static void main(String[] args) {
        ReverseInteger ri = new ReverseInteger();
        System.out.println(ri.reverse(-2147483648 ));
    }

//    public int reverse(int x) {
//        int rev = 0;
//        while (x != 0) {
//            int pop = x % 10;
//            x /= 10;
//            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
//            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
//            rev = rev * 10 + pop;
//        }
//        return rev;
//    }
}
