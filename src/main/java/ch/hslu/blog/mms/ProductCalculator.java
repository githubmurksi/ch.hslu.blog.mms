package ch.hslu.blog.mms;

public class ProductCalculator {

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
            result *= x;
        }
        return result;
    }
}




