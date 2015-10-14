package com.calculatrice.tp.java.controller;

import static org.junit.Assert.*;

import com.calculatrice.tp.java.model.Calculatrice;

public class Test {
	
	double totalAddition = 538.47;
	double totalMultiply = 1323.92;
	
	double doubleA = 2.47;
	double doubleB = 536;
	
	
	public void setUp(){
		
	}

	public void testAddition() {
		
		assertEquals("assertEquals for addition",totalAddition, Calculatrice.addition(doubleA, doubleB), 0.0 );
	}
	
	public void testMultiply (){
		
		assertEquals("assertEquals for multiply",totalMultiply, Calculatrice.multiply(doubleA, doubleB), 0.0 );
	}
}
