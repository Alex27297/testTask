package myCalculator;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.TreeMap;

public class Roman {
    protected static String[] values = {"N", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    private String value;

    public static int toInt(String value) {
        for (int i = 1; i < 11; i++) {
            if (value.equals(values[i])) return i;
        }
        return 0;
    }

    public static String toRoman(int intValue) throws Exception {
        if (intValue < 1) {
            throw new Exception("В римской системе счисления нет нуля и отрицательных чисел");
        }
        if (intValue > 10){
            throw new Exception("Результат операции вне пределов используемого диапазона римских цифр");
        }
        return values[intValue];
    }
}
