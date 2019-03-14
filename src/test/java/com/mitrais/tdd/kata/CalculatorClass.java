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
}
