package com.mitrais.tdd.kata;

/**
 * Created by jchacana on 3/18/19.
 */
public class Calculator {

    public int add(String s) {
        int result = 0;
        if (!s.isEmpty()) {
            String[] resArr = s.split(",|\n");
            for (int i = 0; i < resArr.length; i++) {
                result += Integer.valueOf(resArr[i]);
            }
        }
        return result;
    }
}
