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
            for(int i=0; i<res.length; i++){
                result += Integer.parseInt(res[i]);
            }
        }else {
                result = Integer.parseInt(s);
        }
        return result;
    }
}
