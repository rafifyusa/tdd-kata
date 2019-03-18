package com.mitrais.tdd.kata;

/**
 * Created by jchacana on 3/18/19.
 */
public class Calculator {

    public int add(String s) {

        if(s.isEmpty()) {
            return 0;
        }

        return Integer.valueOf(s);
    }
}
