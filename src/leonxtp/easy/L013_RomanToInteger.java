package leonxtp.easy;

public class L013_RomanToInteger {

    public static void main(String[] args) {
        L013_RomanToInteger test = new L013_RomanToInteger();
        System.out.println(test.romanToInt2("MDCCCLXXXIV"));
    }

    /**
     * 思路：
     * 只有I,X,C三个数字是可以在其他数字左边做减法的
     */
    public int romanToInt2(String s) {
        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            switch (ch) {
                case 'I':
                    result += result >= 5 ? -1 : 1;
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'X':
                    result += result >= 50 ? -10 : 10;
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'C':
                    result += result >= 500 ? -100 : 100;
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;
                default:
                    break;
            }
        }
        return result;
    }


    public int romanToInt(String s) {

        String[] romans1 = {"I", "II", "III", "IV", "V", "VI", "VII"
                , "VIII", "IX"};

        String[] romans10 = {"X", "XX", "XXX", "XL", "L", "LX", "LXX"
                , "LXXX", "XC"};

        String[] romans100 = {"C", "CC", "CCC", "CD", "D", "DC", "DCC"
                , "DCCC", "CM"};

        String[] romans1000 = {"M", "MM", "MMM"};

        int result = 0;
        for (int i = 0; i < 3; i++) {
            if (s.startsWith(romans1000[2 - i])) {
                result += (3 - i) * 1000;
                if (s.length() == romans1000[2 - i].length()) {
                    return result;
                }
                s = s.substring(romans1000[2 - i].length());
                break;
            }
        }

        for (int i = 0; i < 9; i++) {
            if (s.startsWith(romans100[8 - i])) {
                result += (9 - i) * 100;
                if (s.length() == romans100[8 - i].length()) {
                    return result;
                }
                s = s.substring(romans100[8 - i].length());
                break;
            }
        }

        for (int i = 0; i < 9; i++) {
            if (s.startsWith(romans10[8 - i])) {
                result += (9 - i) * 10;
                if (s.length() == romans10[8 - i].length()) {
                    return result;
                }
                s = s.substring(romans10[8 - i].length());
                break;
            }
        }

        for (int i = 0; i < 9; i++) {
            if (s.startsWith(romans1[8 - i])) {
                result += 9 - i;
                if (s.length() == romans1[8 - i].length()) {
                    return result;
                }
                break;
            }
        }

        return result;
    }

}
