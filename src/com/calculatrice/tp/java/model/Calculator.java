package com.calculatrice.tp.java.model;

public class Calculator {

    private double doubleA;
	private double doubleB;

	public Calculator(double doubleA, double doubleB) {
	this.doubleA = doubleA;	
	this.doubleB = doubleB;
    }

	public double addition(){
		return this.doubleA + this.doubleB;
		
	}
	
	public double multiply(){
		return doubleA * doubleB;
		
	}
	
	
	
	

}
