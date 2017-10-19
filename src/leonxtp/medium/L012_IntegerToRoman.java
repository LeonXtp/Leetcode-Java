package leonxtp.medium;

/**
 * 1、3、5、7、9
 * 13、17
 */
public class L012_IntegerToRoman {

    private static final String[] ROMANS = {"I", "II", "III", "IV", "V", "VI", "VII"
    ,"VIII", "IX", "X"};

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
    private String getRomanNumber(int number) {
        if (number < 10) {
            switch (number) {
                case 1:
                    return ROMANS[0];
                case 2:
                    return ROMANS[1];
                case 3:
                    return ROMANS[2];
                case 4:
                    return ROMANS[3];
                case 5:
                    return ROMANS[4];
                case 6:
                    return ROMANS[5];
                case 7:
                    return ROMANS[6];
                default:
                    break;
            }
        }

        return "";
    }

}
