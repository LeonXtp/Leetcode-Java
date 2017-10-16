package leonxtp.medium;

/**
 *
 */
public class L012_IntegerToRoman {

    private static final String[] ROMANS = {"I", "V", "X", "L", "C", "D", "M"};

    public static void main(String args[]) {

    }

    public String intToRoman(int num) {


        StringBuffer sb = new StringBuffer();

        int mod = 10;
        


        return "";
    }

    private String getRomanNumber(int number) {
        switch (number) {
            case 1:
                return ROMANS[0];
            case 5:
                return ROMANS[1];
            case 10:
                return ROMANS[2];
            case 50:
                return ROMANS[3];
            case 100:
                return ROMANS[4];
            case 500:
                return ROMANS[5];
            case 1000:
                return ROMANS[6];
            default:
                break;
        }
        return "";
    }

}
