package model.entities;

import java.util.Date;

public class Installment {
	
	private String expiration;
	private double value;
	private double interestValue;
	private double amortizationValue;
	private double debtBalance;
	private int intallment;
	
	
	public Installment(String dueDate, double value, double interestValue, double amortizationValue,
			double debtBalance, int intallment) {
		this.expiration = dueDate;
		this.value = value;
		this.interestValue = interestValue;
		this.amortizationValue = amortizationValue;
		this.debtBalance = debtBalance;
		this.intallment = intallment;
	}
	
	
	
	
	public String getExpiration() {
		return expiration;
	}
	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public double getInterestValue() {
		return interestValue;
	}
	public void setInterestValue(double interestValue) {
		this.interestValue = interestValue;
	}
	public double getAmortizationValue() {
		return amortizationValue;
	}
	public void setAmortizationValue(double amortizationValue) {
		this.amortizationValue = amortizationValue;
	}
	public double getDebtBalance() {
		return debtBalance;
	}
	public void setDebtBalance(double debtBalance) {
		this.debtBalance = debtBalance;
	}
	public int getIntallment() {
		return intallment;
	}
	public void setIntallment(int intallment) {
		this.intallment = intallment;
	}




	@Override
	public String toString() {
		
		return "Installment (" + intallment
				+"): VALUE = $" + String.format("%.2f", value)
				+ " // Due date = " + expiration
				+ " // Interest = $" + String.format("%.2f", interestValue)
				+ " // Amortization = $" + String.format("%.2f", amortizationValue)
				+ " // Debt Balance = $" + String.format("%.2f", debtBalance);
	}

}
