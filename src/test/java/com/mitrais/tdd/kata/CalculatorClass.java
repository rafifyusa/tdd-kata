package com.mitrais.tdd.kata;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by jchacana on 3/14/19.
 */
public class CalculatorClass {


    @Test
    public void testEmptyCase() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(0, calculator.add(""));
    }

    @Test
    public void testOneCase() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(1, calculator.add("1"));
    }
    
    @Test
    public void testTwoNumber() {
    	Calculator calculator = new Calculator();
    	Assert.assertEquals(3, calculator.add("1,2"));
    }
    
    @Test
    public void testMultipleNumber() {
    	Calculator calculator = new Calculator();
    	Assert.assertEquals(17, calculator.add("3,4,5,5"));
    }
    
    @Test
    public void testNewLine() {
    	Calculator calculator = new Calculator();
    	Assert.assertEquals(6, calculator.add("1\n2,3"));
    }
}
