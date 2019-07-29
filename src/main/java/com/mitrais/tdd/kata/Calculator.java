package com.mitrais.tdd.kata;

/**
 * Created by jchacana on 7/29/19.
 */
public class Calculator {
    public Integer add(String s) {
        int result=0;
        if("".equalsIgnoreCase(s)) {
            return result;
        }else if(s.contains(",")){
            String res[] = s.split(",");
            result = Integer.parseInt(res[0]) + Integer.parseInt(res[1]);
        }else {
                result = Integer.parseInt(s);
        }
        return result;
    }
}
