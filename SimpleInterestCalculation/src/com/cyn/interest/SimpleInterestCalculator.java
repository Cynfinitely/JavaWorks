package com.cyn.interest;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
	private BigDecimal principal;
	private BigDecimal interest;

	public SimpleInterestCalculator(double d, double e) {
		// TODO Auto-generated constructor stub
		this.setPrincipal(new BigDecimal(d));
		this.interest = new BigDecimal(e);
	}

	public BigDecimal getInterest() {
		return interest;
	}

	public void setInterest(BigDecimal interest) {
		this.interest = interest;
	}

	public BigDecimal getPrincipal() {
		return principal;
	}

	public void setPrincipal(BigDecimal principal) {
		this.principal = principal;
	}

	public BigDecimal calculateTotalValue(int noOfYears) {
		return principal.add(principal.multiply(interest).multiply(new BigDecimal(noOfYears)));
	}

}
