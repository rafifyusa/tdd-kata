package com.mitrais.tdd.kata;

import java.util.Arrays;

public class Sequence {
	private int[] numbers;

	public void addElement(int[] numbers) {
		this.numbers = numbers;
	}

	public int[] getElement() {
		
		return numbers;
	}

	public int getMinimumValue() {
		return Arrays.stream(numbers).min().getAsInt();
		//
//		int rtn = 999999999;
//		for (int n : numbers) {
//			if (n < rtn) {
//				rtn = n;
//			}
//		}
//		return rtn;
	}
	
}
