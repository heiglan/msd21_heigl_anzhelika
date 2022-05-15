package at.fhj.msd;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));

        System.out.printf("%.2f\n", (Calculator.minus(15.0, 5)));
        System.out.printf("%.2f\n", (Calculator.add(12.67, 33.7)));
        System.out.printf("%.2f\n", (Calculator.multiply(11.5, 44)));
        System.out.printf("%.2f\n", (Calculator.divide(33.9, 11.3)));

        System.out.println(Calculator.factorial(5));

    }
}

