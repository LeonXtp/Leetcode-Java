package leonxtp.medium;

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 * <p>
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * <p>
 * P  A  A
 * A AA A
 * YA AA
 * A  A
 * <p>
 * <p>
 * And then read line by line: "PAHNAPLSIIGYIR"
 * Write the code that will take a string and make this conversion given a number of rows:
 * <p>
 * https://leetcode.com/problems/zigzag-conversion/description/
 */
public class L006_ZigZagConversion {

    public static void main(String args[]) {
        L006_ZigZagConversion test = new L006_ZigZagConversion();
        System.out.println(test.convert("A", 12));
    }

    public String convert(String s, int numRows) {

        if (numRows == 1 || s.length() == 1) {
            return s;
        }

        StringBuffer[] sbArray = new StringBuffer[numRows];
        for (int i = 0; i < numRows; i++) {
            sbArray[i] = new StringBuffer();
        }

        int index = 0;
        int temp = numRows * 2 - 2;
        while (index < s.length()) {
            if (index % temp < numRows) {
                sbArray[index % temp].append(s.charAt(index));
            } else {
                sbArray[temp - index % temp].append(s.charAt(index));
            }
            index++;
        }

        StringBuffer sbResult = new StringBuffer();
        for (StringBuffer sb : sbArray) {
            sbResult.append(sb);
        }

        return sbResult.toString();
    }

}
