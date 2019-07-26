package com.mitrais.tdd.kata;

/**
 * Created by jchacana on 7/26/19.
 */
public class Calculator {

    public int add(String s) {
        if("".equalsIgnoreCase(s)) {
        	return 0;
        }else {
        	String[] numberList = s.split(",");
        	int total =0;
        	for (int i = 0; i < numberList.length; i++) {
				total += Integer.valueOf(numberList[i]);
			}
        	return total;
        }
    }
}
