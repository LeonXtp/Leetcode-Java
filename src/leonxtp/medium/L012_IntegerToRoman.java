package leonxtp.medium;

import sun.jvm.hotspot.debugger.win32.coff.COFFFile;

/**
 * 1、3、5、7、9
 * 13、17
 */
public class L012_IntegerToRoman {

    private static final String[] ROMANS_1 = {"I", "II", "III", "IV", "V", "VI", "VII"
            , "VIII", "IX"};

    private static final String[] ROMANS_10 = {"I", "II", "III", "IV", "V", "VI", "VII"
            , "VIII", "IX"};

    private static final String[] ROMANS_100 = {"I", "II", "III", "IV", "V", "VI", "VII"
            , "VIII", "IX"};

    private static final String[] ROMANS_1000 = {"I", "II", "III", "IV", "V", "VI", "VII"
            , "VIII", "IX"};

    public static void main(String args[]) {

    }

    public String intToRoman(int num) {


        StringBuffer sb = new StringBuffer();

        int mod = 10;
        while (num / mod > 0) {
            int bitNum = (num % mod) / (mod > 10 ? mod : 1);
            if (bitNum <= 3) {

            } else {

            }
            sb.insert(0, )
            mod *= 10;
        }


        return "";
    }

    //1437  MCDXXXVII
    private String getRomanNumber(int number, int coefficient) {

        StringBuilder sb = new StringBuilder();
        switch (coefficient) {
            case 1:
                if (number <= 3) {
                    while (number > 0) {
                        sb.append("I");
                        number--;
                    }
                } else if (3 < number && number <= 8) {

                } else {

                }
                break;
            case 10:
                break;
            case 100:
                break;
            case 1000:
                break;
        }

        return "";
    }

}
