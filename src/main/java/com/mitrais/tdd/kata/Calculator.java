package com.mitrais.tdd.kata;

/**
 * Created by jchacana on 8/6/19.
 */
public class Calculator {
    public int add(String s) {
        if ("".equals(s)) {
            return 0;
        }
        if (s.contains(",")) {
            String[] numbers = s.split(",");
            int result = 0;
            for (String number : numbers)
                result += Integer.parseInt(number);
            return result;
        }
        if (s.contains(" ")) {
            String[] numbers = s.split(" ");
            int result = 0;
            for (String number : numbers)
                result += Integer.parseInt(number);
            return result;
        }
        return Integer.parseInt(s);
    }
}
