package leonxtp.medium;

/**
 * I,V,X,
 * L,C,D,M
 */
public class L012_IntegerToRoman {

    public static void main(String args[]) {
        L012_IntegerToRoman test = new L012_IntegerToRoman();
        int[] tests = {1, 3, 5, 7, 9, 13, 15, 17, 19, 20, 30, 40, 50, 60, 90, 100,
                111, 200, 400, 900, 1437, 3333};

        for (int data : tests) {
            System.out.println(test.intToRoman2(data));
        }

    }

    public String intToRoman2(int num) {

        String[] romans1 = {"", "I", "II", "III", "IV", "V", "VI", "VII"
                , "VIII", "IX"};

        String[] romans10 = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX"
                , "LXXX", "XC"};

        String[] romans100 = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC"
                , "DCCC", "CM"};

        String[] romans1000 = {"", "M", "MM", "MMM"};

        StringBuilder sb = new StringBuilder();
        return sb.append(romans1000[(num % 10000) / 1000])
                .append(romans100[(num % 1000) / 100])
                .append(romans10[(num % 100) / 10])
                .append(romans1[(num % 10)]).toString();
    }

}
