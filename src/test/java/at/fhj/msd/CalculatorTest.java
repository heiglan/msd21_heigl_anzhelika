package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setup(){
        calculator = new Calculator();
    }

    @Test
    public void calcAdd20(){ Assertions.assertEquals(20, Calculator.add(15.0, 5.0)); }

    @Test
    public void calcAdd21(){ Assertions.assertEquals(21, Calculator.add(3.0,18.0)); }

    @Test
    public void calcMinus5() { Assertions.assertTrue(Calculator.minus(10.5, 5.5) == 5);}

    @Test
    public void calcMinus6() { Assertions.assertTrue(Calculator.minus(12.0, 6.0) == 6);}

    @Test
    public void calcMultiply41() {
        Assertions.assertEquals(20.5 * 2, Calculator.multiply(20.5, 2));}

    @Test
    public void calcMultiply66() {
        Assertions.assertEquals(66, Calculator.multiply(11.0, 6.0));}

    @Test
    public void calcDivide3() {
        Assertions.assertEquals(3, Calculator.divide(33, 11));}

    @Test
    public void calcDivide10() {
        Assertions.assertEquals(10, Calculator.divide(110.0, 11.0));}

    @Test
    public void calcFactorial1() {
        Assertions.assertEquals(120, Calculator.factorial(5));}

    @Test
    public void calcFactorial2() {
        Assertions.assertEquals(6, Calculator.factorial(3));}

    @Test
    public void calcFactorial3() {
        Assertions.assertEquals(720, Calculator.factorial(6));}




}
