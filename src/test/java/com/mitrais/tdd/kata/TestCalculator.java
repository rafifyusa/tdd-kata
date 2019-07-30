package com.mitrais.tdd.kata;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jchacana on 3/26/19.
 */
public class TestCalculator {

    @Test
    public void testEmptyString() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(0, calculator.add(""));
    }

    @Test
    public void testOneNumberOne() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(1, calculator.add("1"));
    }

    @Test
    public void testOneNumberTwo() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(2, calculator.add("2"));
    }

    @Test
    public void testOneComaTwo()
    {
        Calculator calculator= new Calculator();
        Assert.assertEquals(3, calculator.add("1,2"));
    }
}
