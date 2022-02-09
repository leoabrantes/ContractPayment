package model.entities;

import java.util.Date;

public class Installment {
	
	private String dueDate;
	private double totalValue;
	private double interestValue;
	private double amortizationValue;
	private double debtBalance;
	private int intallment;
	
	
	public Installment(String dueDate, double value, double interestValue, double amortizationValue,
			double debtBalance, int intallment) {
		this.dueDate = dueDate;
		this.totalValue = value;
		this.interestValue = interestValue;
		this.amortizationValue = amortizationValue;
		this.debtBalance = debtBalance;
		this.intallment = intallment;
	}
	
	
	
	
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String expiration) {
		this.dueDate = expiration;
	}
	public double getValue() {
		return totalValue;
	}
	public void setValue(double value) {
		this.totalValue = value;
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
				+"): VALUE = $" + String.format("%.2f", totalValue)
				+ " // Due date = " + dueDate
				+ " // Interest = $" + String.format("%.2f", interestValue)
				+ " // Amortization = $" + String.format("%.2f", amortizationValue)
				+ " // Debt Balance = $" + String.format("%.2f", debtBalance);
	}

}
