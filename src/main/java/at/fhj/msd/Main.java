package at.fhj.msd;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));

        //enter 2 double values
        double value1 = 3.5;
        double value2 = 7.7;


        //compute the result
        String print = "%.2f%s%.2f = %.2f\n";

        System.out.printf(print, value1, "+", value2, Calculator.add(value1, value2));
        System.out.printf(print, value1, "-", value2, Calculator.minus(value1, value2));
        System.out.printf(print, value1, "*", value2, Calculator.multiply(value1, value2));
        if (value2 == 0) {
            System.out.println("Division " + value1 + "/" + value2 + " is not possible!");
        } else {
            System.out.printf(print, value1, "/", value2, Calculator.divide(value1, value2));
        }
    }
}

