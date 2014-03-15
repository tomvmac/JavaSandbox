package com.tom.service;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 11/30/13
 * Time: 9:09 PM
 * To change this template use File | Settings | File Templates.
 */

public class MyCalcTest {

    @Test
    public void TestAddNumbers() {
        int a = 1;
        int b = 3;
        int expectedResult = 4;

        int actualResult = MyCalc.addNumbers(a, b);

        assertEquals(actualResult, expectedResult);

    }


}
