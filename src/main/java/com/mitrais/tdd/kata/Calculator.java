package com.mitrais.tdd.kata;

/**
 * Created by jchacana on 3/26/19.
 */
public class Calculator {

    public int add(String input) {
        int ret = 0;
        String defaultDelimiter = ",";
        if("".equals(input)) return 0;

        if (input.contains(defaultDelimiter)) {
            String[] numbers = input.split(defaultDelimiter);
            for (String num : numbers) {
                ret += Integer.parseInt(num);
            }
        }
        else {
            ret = Integer.parseInt(input);
        }
        return ret;
    }
}
