package com.mitrais.tdd.kata;

/**
 * Created by jchacana on 3/18/19.
 */
public class Calculator {

    public int add(String s) {

        if(s.isEmpty()) {
            return 0;
        }

        String [] resArr = s.split(",");
        int result = 0;
        for (int i = 0; i < resArr.length; i++){
            result += resArr[i];
        }

        return Integer.valueOf(s);
    }
}
