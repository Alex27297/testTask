package myCalculator;

public class Roman {
    protected static String[] valuesLessTenInclusive = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",};
    protected static String[] valuesTens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    protected static String[] valuesHundred = {"", "C"};
    private String value;

    public static int toIntLessTenInclusive(String value) {
        for (int i = 1; i < 11; i++) {
            if (value.equals(valuesLessTenInclusive[i])) return i;
        }
        return 0;
    }

    public static String toRomanLessHundredInclusive(int intValue) throws Exception {
        if (intValue < 1) {
            throw new Exception("В римской системе счисления нет нуля и отрицательных чисел");
        }
        int units = intValue % 10;
        int tens = (intValue % 100) / 10;
        int hundreds = intValue / 100;
        return valuesHundred[hundreds].concat(valuesTens[tens]).concat(valuesLessTenInclusive[units]);
    }
}
