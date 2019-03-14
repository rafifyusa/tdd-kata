package com.mitrais.tdd.kata;

/**
 * Created by jchacana on 3/14/19.
 */
public class Calculator {

    public int add(String input) {
    	int ret = 0;
    	
    	input = input.replace("\n", ";");
    	input = input.replaceAll("[^0-9,;.]","");

    	String[] a_input = input.split(",|;|\\.");
    	System.out.println(a_input.length);
    	for (String val: a_input) {
    		val = "".equals(val) ? "0" : val;
    		ret += Integer.parseInt(val);
    	}
    	
        return ret;
    }
}
