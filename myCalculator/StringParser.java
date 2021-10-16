package myCalculator;

public class StringParser {

    /*Метод возвращает true, если выражение состоит из одной математической операции +-/* и двух аргументов,
    являющихся римскими цифрами
    */
    public static boolean isRomanExpression(String string) {
        return string.matches("(I|II|III|IV|V|VI|VII|VIII|IX|X) " +
                "[\\+ \\- \\* \\/] (I|II|III|IV|V|VI|VII|VIII|IX|X)");
    }

    /*Метод возвращает true, если выражение состоит из одной математической операции +-/* и двух аргументов,
    являющихся арабскими цифрами
    */
    protected static boolean isArabianExpression(String string) {
        return string.matches("([0-9]|10) [\\+ \\- \\* \\/] ([0-9]|10)");
    }

    /*Метод извлекает члены выражения и помещает в массив*/
    protected static String[] members(String expression) throws Exception {
        if (!(isRomanExpression(expression) || isArabianExpression(expression))){
            throw new Exception("\nФормат математической операции не удовлетворяет заданию," +
                    "\nстрока не является математической операцией " +
                    "\nили одновременно используются разные системы счисления");
        }
        return expression.split(" ");
    }

    /*извлекает из выражения первый или второй аргумент, и приводит его к типу int*/
    public static int argument(String expression, int argumentNumber) throws Exception {
        int index = (argumentNumber - 1) * 2;
        String member = members(expression)[index];
        if (isRomanExpression(expression)) return Roman.toInt(member);
        return Integer.parseInt(member);
    }
    /*извлекает из выражения знак математической операции*/
    public static String operation(String expression) throws Exception {
        return members(expression)[1];
    }
}

