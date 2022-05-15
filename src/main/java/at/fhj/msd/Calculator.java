package at.fhj.msd;

import java.util.Locale;

public class Calculator {

    public static double add(double number1, double number2) {
        return number1 + number2;
    }

    public static double minus(double number1, double number2) {
        return number1 - number2;
    }

    public static double multiply(double number1, double number2) {
        return number1 * number2;
    }

    public static double divide(double number1, double number2) {
        return number1 / number2;
    }

    public static long factorial(int n) {
        long fact = 1;
        int i = 1;
        while (i <= n) {
            fact = fact * i;
            i++;
        }
        return fact;
    }
}