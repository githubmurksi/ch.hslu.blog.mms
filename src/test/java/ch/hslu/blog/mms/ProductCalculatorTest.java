package ch.hslu.blog.mms;

import static org.junit.Assert.*;
import org.junit.Test;

public class ProductCalculatorTest {

    @Test
    public void testCalc() {
        ProductCalculator calculator = new ProductCalculator();
        int[] values = {2, 3};
        int expected = 6;
        int result = calculator.calc(values);
        assertEquals(expected, result);
    }

    @Test(expected=ArithmeticException.class)
    public void testOverflow() {
        ProductCalculator calculator = new ProductCalculator();
        int[] values = {Integer.MAX_VALUE, 2};
        calculator.calc(values);
    }
}
