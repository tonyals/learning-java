package br.com.tony.generics;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

public class Article {
    public static void main(String[] args) {
        Object[] objects = new Object[3];
        objects[0] = BigInteger.TEN;
        objects[1] = BigDecimal.TEN;

        for (Object object : objects) {
            BigInteger bigInteger = (BigInteger) object;
        }

        System.out.println(Arrays.toString(objects));
    }
}
