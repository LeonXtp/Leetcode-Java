package leonxtp.easy;

/**
 * Reverse digits of an integer.
 * <p>
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 * <p>
 * https://leetcode.com/problems/reverse-integer/description/
 */
public class L007_ReverseInteger {

    public static void main(String args[]) {

        L007_ReverseInteger test = new L007_ReverseInteger();
        System.out.println(test.reverse(Integer.MIN_VALUE));
    }

    public int reverse(int x) {

        String sx = String.valueOf(x);
        String rsx = new StringBuffer(sx).reverse().toString();
        if (rsx.contains("-")) {
            rsx = "-".concat(rsx.substring(0, rsx.length() - 1));
        }
        try {
            return Integer.valueOf(rsx);
        } catch (Exception e) {
            return 0;
        }
    }

}
