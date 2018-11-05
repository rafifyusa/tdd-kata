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

	}

	public int getMaximumValue() {
		return Arrays.stream(numbers).max().getAsInt();
	}

	public int getNumberElement() {

		return (int) Arrays.stream(numbers).count();
	}

	public double getAverageValue() {

		return Arrays.stream(numbers).average().getAsDouble();
	}
	
}
