package ch.hslu.blog.mms;

public class ProductCalculatorFixed {

    /**
     * Berechne das Produkt
     *
     * @param values Faktoren
     * @return Produkt aus den Faktoren
     */
    public int calc(int[] values) {
        if (values.length == 0)
            return 0;

        int result = 1;
        for (int x : values) {
            // Mit der Math-Biliothek wird eine Exception geschmissen, falls ein Overflow auftritt
            result = Math.multiplyExact(result, x);
        }
        return result;
    }
}



