package com.tom.service

import spock.lang.Specification

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 11/30/13
 * Time: 9:21 PM
 * To change this template use File | Settings | File Templates.
 */
class MyCalcSpockTest extends Specification{

    def "1 plus 3 equals 4"(){
        when:
            def a = 1
            def b = 3
            def actualResult = MyCalc.addNumbers(a, b)
            def expectedResult = 4
        then:
            actualResult == expectedResult
    }



}
