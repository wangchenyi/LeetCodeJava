package algorithms.easy;

/**
 * 套路：26进制
 */
public class ExcelSheetColumnNumber {

    public int titleToNumber(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += Math.pow(26, s.length() - i - 1) * (s.charAt(i) - 'A' + 1);
        }
        return sum;
    }

    public static void main(String[] args) {
        ExcelSheetColumnNumber escn = new ExcelSheetColumnNumber();
        System.out.println(escn.titleToNumber("AB"));
    }
}
