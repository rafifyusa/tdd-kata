package com.mitrais.tdd.kata;

/**
 * Created by jchacana on 3/14/19.
 */
public class Calculator {

    public int add(String input) {
    	int ret = 0;

    	
    	input = input.replaceAll("//;","");
    	input = input.replace("\n", ";");
    	
    	String[] a_input = input.split(",|;");
    	
    	for (String val: a_input) {
    		val = "".equals(val) ? "0" : val;
    		ret += Integer.parseInt(val);
    	}
        
        return ret;    
        
    }
}
