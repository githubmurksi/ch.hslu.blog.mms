package ch.hslu.blog.mms;

import static org.junit.Assert.*;
import org.junit.Test;

public class ProductCalculatorHumanTest {

    @Test
    public void testProductOf_2_3_5() {
        ProductCalculator calculator = new ProductCalculator();
        int[] values = {2, 3, 5};
        int expected = 30;
        int result = calculator.calc(values);
        assertEquals(expected, result);
    }

    @Test
    public void testProductWithZeroFactor() {
        ProductCalculator calculator = new ProductCalculator();
        int[] values = {0, 5};
        int expected = 0;
        int result = calculator.calc(values);
        assertEquals(expected, result);
    }
}
