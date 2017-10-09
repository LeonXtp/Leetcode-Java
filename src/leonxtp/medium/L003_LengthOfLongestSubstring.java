package leonxtp.medium;

public class L003_LengthOfLongestSubstring {


    public static void main(String args[]) {
        L003_LengthOfLongestSubstring test = new L003_LengthOfLongestSubstring();
        int result = test.lengthOfLongestSubstring("abcabcbbabcdefgbb");
        System.out.println(result);
    }

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int maxLength = 0;
        int indexStart = 0, indexEnd = 1;//start:inclusive end:exclusive
        String previousStr;
        while (indexEnd < s.length()) {
            String currStr = s.substring(indexEnd, indexEnd + 1);
            previousStr = s.substring(indexStart, indexEnd);
            if (previousStr.contains(currStr)) {
                int currentLength = indexEnd - indexStart;
                maxLength = Math.max(currentLength, maxLength);
                indexStart += previousStr.indexOf(currStr) + 1;
            }
            indexEnd++;
        }
        int currentLength = indexEnd - indexStart;
        maxLength = Math.max(currentLength, maxLength);
        return maxLength;
    }
}
