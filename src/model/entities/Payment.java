package model.entities;

public class Payment {
	
	private int months;
	private Double value;
	private Double interest;
	
	public Payment() {
	}

	public Payment(int months, Double value, double interest) {
		this.months = months;
		this.value = value;
		this.interest = interest;
	}

	public int getMonths() {
		return months;
	}

	public void setMonths(int installment) {
		this.months = installment;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Double getInterest() {
		return interest;
	}

	public void setInterest(Double interest) {
		this.interest = interest;
	}
	

}
