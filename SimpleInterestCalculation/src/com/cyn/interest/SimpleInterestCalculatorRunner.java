package com.cyn.interest;

import java.math.BigDecimal;

public class SimpleInterestCalculatorRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleInterestCalculator calculator = new SimpleInterestCalculator(4500.00, 7.5);
		System.out.println(calculator.getPrincipal());
		System.out.println(calculator.getInterest());

		BigDecimal totalValue = calculator.calculateTotalValue(5);
		System.out.println(totalValue);

	}

}
