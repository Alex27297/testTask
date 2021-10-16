import myCalculator.Calc;
import myCalculator.StringParser;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String expression = input.nextLine();
       System.out.println(Calc.result(expression));
    }
}
