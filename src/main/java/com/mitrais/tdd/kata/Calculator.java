package com.mitrais.tdd.kata;

/**
 * Created by jchacana on 7/30/19.
 */
public class Calculator {
    public int add(String s) {
        if ("".equalsIgnoreCase(s)) {
            return 0;
        }
        String[] tokens = s.split(",");
        int integer1 = Integer.parseInt(tokens[0]);
        int integer2 = Integer.parseInt(tokens[1]);
        return integer1 + integer2;
    }
}
