package algorithms.easy;

/**
 * 套路：前后夹逼
 */

public class ReverseString {

    public void reverseString(char[] s) {
        for(int i = 0; i < s.length / 2; i++) {
            swap(s, i, s.length -1 -i);
        }
    }

    public static void swap(char[] s, int a, int b) {
        char tmp = s[a];
        s[a] = s[b];
        s[b] = tmp;
    }
}
