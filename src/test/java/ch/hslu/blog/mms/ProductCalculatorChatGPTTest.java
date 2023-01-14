package ch.hslu.blog.mms;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductCalculatorChatGPTTest {
    private final ProductCalculator calculator = new ProductCalculator();

    @Test
    public void testCalc() {
        // Test normaler Eingaben
        assertEquals(120, calculator.calc(new int[]{2, 3, 4, 5}));

        // Test mit Nullen
        assertEquals(0, calculator.calc(new int[]{0, 1, 2, 3}));

        // Test mit negativen Werten
        assertEquals(-6, calculator.calc(new int[]{-2, 3}));

        // Test mit leerem Array
        assertEquals(1, calculator.calc(new int[]{}));

        //Test mit Overflow
        try {
            calculator.calc(new int[]{Integer.MAX_VALUE, 2});
            Assert.fail("Overflow wurde nicht erkannt.");
        } catch(ArithmeticException e) {
            // Erwartete Ausnahme
        }
    }
}

