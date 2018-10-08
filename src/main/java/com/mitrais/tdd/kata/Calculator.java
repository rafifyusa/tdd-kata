package com.mitrais.tdd.kata;

/**
 * Created by jchacana on 10/8/18.
 */
public class Calculator {

    public int add(String input) {
        if (!input.isEmpty()) {
            int rtn = 0;
            if (input.startsWith("//")) {
                Character delimiter = input.charAt(2);
                String txt = input.substring(4);
                System.out.println(txt);
                String[] listS = txt.split("["+delimiter+"\n]");
                for (String s : listS) {
                    rtn += Integer.parseInt(s);
                }
            } else {
                String[] listS = input.split("[,\n]");
                for (String s : listS) {
                    rtn += Integer.parseInt(s);
                }
            }
            return rtn;
        } else {
            return 0;
        }
    }
}
