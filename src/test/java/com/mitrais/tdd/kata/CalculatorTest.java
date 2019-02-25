package com.mitrais.tdd.kata;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by jchacana on 2/25/19.
 */
public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void instiatiateCalculator(){
        this.calculator = new Calculator();
    }

    @Test
    public void testEmptyCase() {
        Assert.assertEquals(0, calculator.add(""));
    }
    
    @Test
    public void testOneCase(){
    	Assert.assertEquals(1, calculator.add("1"));
    }

    @Test
    public void testTwoCase(){
        Assert.assertEquals(2,calculator.add("2"));
    }

    @Test
    public void testTwoNumbersCase(){
        Assert.assertEquals(3,calculator.add("1,2"));
    }
}
