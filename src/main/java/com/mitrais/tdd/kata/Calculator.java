package com.mitrais.tdd.kata;

/**
 * Created by jchacana on 8/6/19.
 */
public class Calculator {
    public int add(String s) {
        if("".equals(s)) {
            return 0;
        }
        if(s.contains(",")) {
            String[] numbers = s.split(",");
            return Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
        }
        return Integer.parseInt(s);
    }
}
