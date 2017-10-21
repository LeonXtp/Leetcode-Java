package leonxtp.easy;

public class L014_LongestCommonPrefix {

    private static final String[] testStrs = {"baabcd", "abcd"};

    public static void main(String[] args) {
        L014_LongestCommonPrefix test = new L014_LongestCommonPrefix();
        System.out.println(test.longestCommonPrefix(testStrs));
    }

    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) {
            return "";
        }

        int shortestLen = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            shortestLen = strs[i].length() < shortestLen ? strs[i].length() : shortestLen;
        }

        for (int i = 0; i < shortestLen; i++) {
            char charInfirstStr = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                char charInStrJ = strs[j].charAt(i);
                if (charInfirstStr != charInStrJ) {
                    if (i == 0) {
                        return "";
                    } else {
                        return strs[0].substring(0, i);
                    }
                }
            }
        }

        return strs[0].substring(0, shortestLen);

    }

    //想多了

    public String longestCommonPrefix0(String[] strs) {

        if (strs.length == 0) {
            return "";
        }

        int shortestLen = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            shortestLen = strs[i].length() < shortestLen ? strs[i].length() : shortestLen;
        }

        if (shortestLen == 0) {
            return "";
        }

        int index = getMaxMatchIndex(strs, 0, shortestLen - 1);
        return index < 0 ? "" : strs[0].substring(0, index + 1);
    }

    /**
     * 找到某个区间最大的公共字串位置
     */
    private int getMaxMatchIndex(String[] strs, int l, int r) {

        if (l >= r) {
            if (checkMathAtIndex(strs, l)) {
                return l;
            } else {
                return -1;
            }
        }

        int mid = (l + r) / 2;
        boolean isMatch = checkMathAtIndex(strs, mid);
        if (isMatch) {
            int maxMatchIndex = getMaxMatchIndex(strs, l, mid);
            if (maxMatchIndex != mid) {
                return getMaxMatchIndex(strs, l, maxMatchIndex - 1);
            } else {
                int find = getMaxMatchIndex(strs, mid + 1, r);
                return find == -1 ? mid : find;
            }
        } else {
            return getMaxMatchIndex(strs, l, mid);
        }
    }

    private boolean checkMathAtIndex(String[] strs, int index) {
        char first = strs[0].charAt(index);
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].charAt(index) != first) {
                return false;
            }
        }
        return true;
    }


}
