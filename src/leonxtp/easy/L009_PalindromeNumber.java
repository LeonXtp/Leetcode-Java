package leonxtp.easy;

/**
 * Determine whether an integer is a palindrome. Do this without extra space.
 * <p>
 * https://leetcode.com/problems/palindrome-number/description/
 */
public class L009_PalindromeNumber {

    public static void main(String args[]) {
        L009_PalindromeNumber test = new L009_PalindromeNumber();
        System.out.println(test.isPalindrome(22));
    }

    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        if (x < 10 || x % 11 == 0 && x < 100) {
            return true;
        }

        int bigDivision = 1000000000;
        int smallMod = 10;

        int bigTemp = 0, small;

        while (x / bigDivision == 0) {
            bigDivision /= 10;
        }

        // 1223221
        while (bigDivision >= smallMod) {
            if (x >= 1000000000 && bigDivision == 1000000000) {
                bigTemp = x / bigDivision;
            } else {
                bigTemp = (x % (bigDivision * 10)) / bigDivision;
            }
            small = (x % smallMod) / (smallMod / 10);
            if (bigTemp == small) {
                bigDivision /= 10;
                smallMod *= 10;
            } else {
                return false;
            }
        }

        return true;
    }

}
