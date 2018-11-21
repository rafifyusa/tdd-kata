package com.mitrais.tdd.kata;

public class Calculator {

	public int add(String string) {
		// TODO Auto-generated method stub

		int result = 0;
		
		if ("".equals(string)) {
			result = 0;
		} else {
			string = string.replace("\n", ",");
			String [] numbers = string.split(",");
			for(String number:numbers) {
				result += Integer.parseInt(number);
			}
		}

		return result;
	}

}
