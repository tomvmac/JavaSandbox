package com.tommac;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 3/30/14
 * Time: 3:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyCalcTest {

    @Test
    public void TestAddNumbers() {
        int a = 1;
        int b = 2;
        int c = 3;
        int expectedResult = 6;

        int actualResult = MyCalc.addNumbers(a, b, c);

        assertEquals(actualResult, expectedResult);

    }


}
