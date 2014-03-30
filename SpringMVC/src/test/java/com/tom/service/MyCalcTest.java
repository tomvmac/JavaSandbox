package com.tom.service;

import static org.junit.Assert.*;
import org.junit.Test;
import com.tommac.MyCalc;

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
        int c = 3;
        int expectedResult = 7;

        int actualResult = MyCalc.addNumbers(a, b, c);

        assertEquals(actualResult, expectedResult);

    }


}
