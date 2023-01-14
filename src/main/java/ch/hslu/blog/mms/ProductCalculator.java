package ch.hslu.blog.mms;

public class ProductCalculator {

    public int calc(int[] values) {
        int result = 1;
        for (int x : values) {
            result *= x;
        }
        return result;
    }

}
