package com.mitrais.tdd.kata;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jchacana on 3/26/19.
 */
public class TestKata {

    @Test
    public void test1() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(0, calculator.add(""));
    }

    @Test
    public void test2() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(1, calculator.add("1"));
    }

    @Test
    public void test3() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(2, calculator.add("2"));
    }
    
    @Test
    public void test4() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(3, calculator.add("1,2"));
    }
    @Test
    public void test5() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(15, calculator.add("1,2,3,4,5"));
    }

}
