package at.fhj.msd;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * Class that implements the Calculator.
 *
 * @author Anzhelika Heigl
 */
public class Calculator {
    private static Logger logger = LogManager.getLogger("LoggingCalculator");

    /**
     * <p>Returns a result of the addition.</p>
     *
     * @param number1 summand 1
     * @param number2 summand 2
     * @return sum of number 1 and number2
     */
    public static double add(double number1, double number2) {
        logger.debug("parameters: " + number1 + ", " + number2);
        return number1 + number2;
    }

    /**
     * <p>Returns a result of the subtraction.</p>
     *
     * @param number1 minuend
     * @param number2 subtrahend
     * @return difference of number 1 and number2
     */
    public static double minus(double number1, double number2) {
        logger.debug("parameters: " + number1 + ", " + number2);
        return number1 - number2;
    }

    /**
     * <p>Returns a result of the multiplication.</p>
     *
     * @param number1 multiplier
     * @param number2 multiplicand
     * @return product of number 1 and number2
     */
    public static double multiply(double number1, double number2) {
        logger.debug("parameters: " + number1 + ", " + number2);
        return number1 * number2;
    }

    /**
     * <p>Returns a result of the division.</p>
     *
     * @param number1 dividend
     * @param number2 divisor
     * @throws ArithmeticException if division by zero occurs
     * @return quotient of number 1 and number2
     */
    public static double divide(double number1, double number2) {
        logger.debug("parameters: " + number1 + ", " + number2);
        double result = 0;

        if (number2 == 0) {
            logger.error("Division by zero!");
            throw new ArithmeticException();

        } else {
            result = number1 / number2;
        }
        return result;
    }

    /**
     * <p>Returns a factorial of a non-negative integer n.</p>
     *
     * @param n non-negative integer
     * @return product of all positive integers less than or equal to n
     */
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