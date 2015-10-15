package com.calculatrice.tp.java.controller;

import com.calculatrice.tp.java.model.Calculator;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;



public class TestCases {

  Calculator calculator;
  double totalAddition = 538.47;
  double totalMultiply = 1323.92;

  double doubleA = 2.47;
  double doubleB = 536;

  @Before
  public void setUp() {

    calculator = new Calculator(2.47, 536);

  }

  @Test
  public void testAddition() {

    assertEquals("assertEquals for addition", totalAddition,calculator.addition(), 0.0);
  }

  @Test
  public void testMultiply() {

    assertEquals("assertEquals for multiply", totalMultiply,calculator.multiply(), 0.0);
  }
}
