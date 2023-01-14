/*
 * Copyright (c) BSI Business Systems Integration AG. All rights reserved.
 * http://www.bsiag.com/
 */
package ch.hslu.blog.mms;

public class Main {

    public static void main(String[] args) {
        ProductCalculator product = new ProductCalculator();
        int result = product.calc(new int[] { 3, 2 });
        System.out.println(result);
    }



}
