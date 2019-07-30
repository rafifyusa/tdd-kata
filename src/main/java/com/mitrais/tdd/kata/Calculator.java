package com.mitrais.tdd.kata;

import java.util.ArrayList;

/**
 * Created by jchacana on 7/30/19.
 */
public class Calculator {
    public int add(String s) {
        if ("".equalsIgnoreCase(s)) {
            return 0;
        }

        String delimiter = ",";
        String tempString = s;
        if(s.length() > 2 && s.substring(0,2).equals("//")){
            delimiter = s.substring(2,3);
            tempString = s.substring(4);
        }

        tempString = tempString.replace("\n", delimiter);

        int sum = 0;
        String[] tokens = tempString.split(delimiter);

        for (String token : tokens) {
            sum += Integer.parseInt(token);
        }

        return sum;
    }
}
