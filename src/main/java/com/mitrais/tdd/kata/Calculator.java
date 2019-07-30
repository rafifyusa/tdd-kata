package com.mitrais.tdd.kata;

/**
 * Created by jchacana on 7/30/19.
 */
public class Calculator {
    public int add(String s) {
        if ("".equalsIgnoreCase(s)) {
            return 0;
        }
        String[] tokens = s.split("\\n?,");
        int sum = 0;
        for (String token : tokens) {
            sum += Integer.parseInt(token);
        }
        return sum;
    }
}
