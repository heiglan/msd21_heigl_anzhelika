package at.fhj.msd;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class Calculator {
    private static Logger logger = LogManager.getLogger("LoggingCalculator");

    public static double add(double number1, double number2) {
        logger.debug("parameters: " + number1 + ", " + number2);
        return number1 + number2;
    }

    public static double minus(double number1, double number2) {
        logger.debug("parameters: " + number1 + ", " + number2);
        return number1 - number2;
    }

    public static double multiply(double number1, double number2) {
        logger.debug("parameters: " + number1 + ", " + number2);
        return number1 * number2;
    }

    public static double divide(double number1, double number2) {
        logger.debug("parameters: " + number1 + ", " + number2);
        double result = 0;
        /*try {
            result = number1 / number2;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero!");
            e.printStackTrace();

        }*/
        if (number2 == 0) {
            logger.error("Division by zero!");
            throw new ArithmeticException();

        } else {
            result = number1 / number2;
        }
        return result;
    }

    public static long factorial(int n) {
        logger.debug("parameter: " + n);

        long fact = 1;
        int i = 1;
        while (i <= n) {
            fact = fact * i;
            i++;
        }
        return fact;
    }
}