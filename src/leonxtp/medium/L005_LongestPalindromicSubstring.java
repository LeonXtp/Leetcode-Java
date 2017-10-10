package leonxtp.medium;

/**
 * Given a string s, find the longest palindromic substring in s.
 * You may assume that the maximum length of s is 1000.
 * <p>
 * https://leetcode.com/problems/longest-palindromic-substring/description/
 */
public class L005_LongestPalindromicSubstring {

    public static void main(String args[]) {
        L005_LongestPalindromicSubstring test = new L005_LongestPalindromicSubstring();
        System.out.println(test.longestPalindrome("abadabac"));
    }

    public String longestPalindrome(String s) {

        int maxLength = 1;

        String result = s.substring(0, 1);

        StringBuffer sb = new StringBuffer("#");
        int i = 0;
        while (i < s.length()) {
            sb.append(s.charAt(i)).append("#");
            i++;
        }
        s = sb.toString();

        int index = 1, j, k;

        while (index < s.length() - 1) {

            j = index - 1;
            k = index + 1;
            int tempLength = 3;

            while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {

                tempLength += 2;
                if (maxLength < tempLength) {
                    maxLength = tempLength;
                    result = s.substring(j, k + 1);
                }
                --j;
                ++k;

            }

            index++;

        }

        return result.replace("#", "");
    }


}
