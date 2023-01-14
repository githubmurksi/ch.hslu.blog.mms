package ch.hslu.blog.mms;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductCalculatorChatGPTExtendedTest {
    private final ProductCalculator calculator = new ProductCalculator();

    @Test
    public void testCalc() {
        // Test normaler Eingaben
        assertEquals(1, calculator.calc(new int[]{1, 1}));
        assertEquals(6, calculator.calc(new int[]{2, 3}));
        assertEquals(120, calculator.calc(new int[]{2, 3, 4, 5}));

        // Test mit Nullen
        assertEquals(0, calculator.calc(new int[]{0, 1, 2, 3}));
        assertEquals(0, calculator.calc(new int[]{1, 2, 3, 0}));
        assertEquals(0, calculator.calc(new int[]{0}));

        // Test mit negativen Werten
        assertEquals(-6, calculator.calc(new int[]{-2, 3}));
        assertEquals(6, calculator.calc(new int[]{-2, -3}));
        assertEquals(-24, calculator.calc(new int[]{-2, -3, -4}));

        // Test mit leerem Array
        assertEquals(0, calculator.calc(new int[]{}));

        //Test mit Overflow
        try {
            calculator.calc(new int[]{Integer.MAX_VALUE, 2});
            Assert.fail("Overflow wurde nicht erkannt.");
        } catch(ArithmeticException e) {
            // Erwartete Ausnahme
        }
    }
}
