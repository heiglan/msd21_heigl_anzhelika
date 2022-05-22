package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Locale;


public class Main {
    //private static Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));





        System.out.printf("%.2f\n", (Calculator.minus(15.0, 5)));
        System.out.printf("%.2f\n", (Calculator.add(12.67, 33.7)));
        System.out.printf("%.2f\n", (Calculator.multiply(11.5, 44)));
        try {
            System.out.printf("%.2f\n", (Calculator.divide(5, 0)));
        } catch (ArithmeticException e){
                    }

        System.out.println(Calculator.factorial(5));



    }
}

