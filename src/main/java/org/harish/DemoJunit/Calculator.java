package org.harish.DemoJunit;

public class Calculator {

	CalculatorService service;
	
	public Calculator() {
	}

	public Calculator(CalculatorService service) {
		this.service = service;
	}

	public int perform(int i, int j) {
		getMessage();
		return (i + j) * i;
	}

	public void getMessage() {
		System.out.println("Checking void methods");
	}

}
