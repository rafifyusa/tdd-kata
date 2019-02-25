package com.mitrais.tdd.kata;

/**
 * Created by jchacana on 2/25/19.
 */
public class Calculator {

    public int add(String s) {
        if(!s.isEmpty()){
            return Integer.parseInt(s);

        }
        return 0;
    }
}
