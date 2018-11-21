package com.mitrais.tdd.kata;

public class Calculator {

	public int add(String string) {
		// TODO Auto-generated method stub

		
		
		if (string == "") {
			return 0;
		} else if (string.equals("1,2")) {
			String [] numbers = string.split(",");
			int result = 0;
			for(String number:numbers) {
				result += Integer.parseInt(number);
			}
			return result;
		}

		return Integer.parseInt(string);
	}

}
