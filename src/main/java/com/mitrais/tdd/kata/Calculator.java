package com.mitrais.tdd.kata;

/**
 * Created by jchacana on 10/8/18.
 */
public class Calculator {

    public int add(String input) {
        if (!input.isEmpty()) {
            int rtn = 0;
            String delimiter =",";


            if (input.startsWith("//")) {
                delimiter = String.valueOf(input.charAt(2));
                input = input.substring(4);

            }

            String[] listS = input.split("["+delimiter+"\n]");
            for (String s : listS) {
                rtn += Integer.parseInt(s);
            }

            return rtn;
        } else {
            return 0;
        }
    }
}
