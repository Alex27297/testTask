package myCalculator;

public class Calc {
    public static String result(String expression) throws Exception {
        int arg1 = StringParser.argument(expression, 1);
        int arg2 = StringParser.argument(expression, 2);
        int intResult=0;
        switch (StringParser.operation(expression)) {
            case ("+"):
                intResult = arg1 + arg2;
                break;
            case ("-"):
                intResult = arg1 - arg2;
                break;
            case ("*"):
                intResult = arg1 * arg2;
                break;
            case ("/"):
                intResult = arg1 / arg2;
                break;
        }
        if (StringParser.isRomanExpression(expression)){
          return Roman.toRoman(intResult);
        }
        else return Integer.toString(intResult);
    }
}