package leonxtp.medium;

/**
 * "    +23"
 * "+-2"
 * "   +-2"
 * "-"
 * " -10a992"
 * "2147483648"--> 2147483647
 * <p>
 * "-2147483647" "" "9223372036854775809" "1" "2147483648" "+-2" "  -0012a42" "    010"
 */
public class L008_StringToInteger {

    public static void main(String args[]) {
        L008_StringToInteger test = new L008_StringToInteger();
        System.out.println(test.myAtoi("+-2"));
    }

    public int myAtoi(String str) {

        if (str == null || str.length() == 0) {
            return 0;
        }

        StringBuffer sb = new StringBuffer();
        char ch;
        int numberStartIndex = 0;
        for (int i = 0; i < str.length(); i++) {

            ch = str.charAt(i);
            if (ch == 32 && numberStartIndex == i) {
                numberStartIndex++;
                continue;
            }
            if ((ch == 43 || ch == 45)) {
                if (numberStartIndex == i) {
                    sb.append(ch);
                    continue;
                } else {
                    break;
                }
            }

            if (ch >= 48 && ch <= 57) {
                sb.append(ch);
            } else {
                break;
            }

        }

        String result = sb.toString();
        if (result.length() < 12) {
            try {
                if (Long.valueOf(result) < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                } else if (Long.valueOf(result) > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                return Integer.valueOf(sb.toString());
            } catch (NumberFormatException e) {
                return 0;
            }
        } else if (result.contains("-")) {
            return Integer.MIN_VALUE;
        } else {
            return Integer.MAX_VALUE;
        }
    }

}
