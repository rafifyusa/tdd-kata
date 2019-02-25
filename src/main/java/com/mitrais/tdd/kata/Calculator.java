package com.mitrais.tdd.kata;

/**
 * Created by jchacana on 2/25/19.
 */
public class Calculator {

    public int add(String s) {
        if(s.equalsIgnoreCase("")){
            return 0;
        }
        String[] numbers = s.split(",");
        int sum=0;
        for(String n: numbers){
            sum+=Integer.parseInt(n);
        }
        return sum;
    }
}
