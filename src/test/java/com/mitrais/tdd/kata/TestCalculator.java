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
    public void testNumberOne() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(1, calculator.add("1"));
    }

    @Test
    public void testNumberTwo() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(2, calculator.add("2"));
    }

    @Test
    public void testTwoNumbers(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(3, calculator.add("1,2"));
    }

    @Test
    public void testNumberTen() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(10, calculator.add("10"));
    }

    @Test
    public void testThreeNumbers(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(10, calculator.add("1,4,5"));
    }

    @Test
    public void testFiveNumbers(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(100, calculator.add("25,10,15,5,45"));
    }
}
