package string;

public class ValidPalindrome {

    // 注释的方法会超时
//    public boolean isPalindrome(String s) {
//        if(s == null)
//            return true;
//        String str = s.replaceAll("[^a-z^A-Z^0-9]", "").toLowerCase();
//        return isPalindrome(str, str.length());
//    }
//
//    private boolean isPalindrome(String s, int length) {
//        if (length == 0 || length == 1)
//            return true;
//        return s.charAt(0) == s.charAt(s.length() - 1) && isPalindrome(s.substring(1, length - 1), length - 2);
//    }

    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0)
            return true;
        char[] arr = s.toCharArray();
        boolean flag = true;
        for(int begin = 0, end = s.length() - 1; begin < end; begin++ , end--){
            while (!vaildChar(arr[begin]) && begin < end){
                begin++;
            }
            while (!vaildChar(arr[end]) && begin < end){
                end--;
            }
            if(begin != end && !String.valueOf(arr[begin]).toLowerCase().equals(String.valueOf(arr[end]).toLowerCase())){
                flag = false;
                break;
            }
        }
        return flag;
    }

    private boolean vaildChar(char ch){
        return 'A' <= ch && ch <= 'Z' || 'a' <= ch && ch <= 'z' || '0' <= ch && ch <= '9';
    }

}
