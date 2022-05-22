package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setup(){
        calculator = new Calculator();
    }

    @Test
    public void calcAdd20(){ Assertions.assertEquals(20, Calculator.add(15.0, 5.0)); }


    @Test
    public void calcMinus5() { Assertions.assertTrue(Calculator.minus(10.5, 5.5) == 5);}


    @Test
    public void calcMultiply41() {
        Assertions.assertEquals(20.5 * 2, Calculator.multiply(20.5, 2));}


    @Test
    public void calcDivide3() {
        Assertions.assertEquals(3, Calculator.divide(33, 11));}


    @Test
    public void testZeroDivision() {
        assertThrows(ArithmeticException.class, () -> {
                    Calculator.divide(5,0);
        });
    }

    @Test
    public void calcFactorial1() {
        Assertions.assertEquals(120, Calculator.factorial(5));}





}
