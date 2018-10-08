package com.mitrais.tdd.kata;

/**
 * Created by jchacana on 10/8/18.
 */
public class Calculator {

    public int add(String input) {
        if (!input.isEmpty()) {
            String[] listS = input.split(",");
            int rtn = 0;
            for(String s : listS) {
                rtn += Integer.parseInt(s);
            }
            return rtn;
        } else {
            return 0;
        }
    }
}
