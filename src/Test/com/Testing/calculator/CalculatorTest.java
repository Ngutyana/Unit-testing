package com.Testing.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

 //first way using an instance
 private final Calculator calc = new Calculator();  //using private is protecting the instance

            /* 2nd way
    private Calculator calc = new Calculator();
    @BeforeEach  //second way
    void setUp(){
        calc = new Calculator();
    }      */

    @Test      //this calls junit to test the method
    public void canAddZeroPlusZero(){
        int sum = calc.add(0, 0); //zero plus zero
        assertEquals(0, sum,"expected sum is 0");  //the expected result of the sum is 0
    }

    @Test      //this calls junit to test the method
    public void canAddOnePlusOne(){
        int sum = calc.add(1, 1); //1+1
        assertEquals(2, sum,"expected sum is 2");  //the expected result of the sum is 2
    }

    @Test      //this calls junit to test the method
    public void canAddNegativeOnePlusOne(){
        int sum = calc.add((-1), 1); //(-1)+1
        assertEquals(0, sum,"expected sum is 0");  //the expected result of the sum is 0
    }

// --------------------- TESTING EDGE CASES ----------------------------

    @Test
    public void canAddMaxIntPlusOne(){
        int sum = calc.add(Integer.MAX_VALUE, 0); //testing maximum value
        System.out.println(sum);  // 2147483648
        assertEquals(Integer.MAX_VALUE, sum);
    }
}
