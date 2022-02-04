package model.entities;

public class Payment {
	
	private int installment;
	private Double value;
	private Double interest;
	
	public Payment() {
	}

	public Payment(int installment, Double value, double interest) {
		this.installment = installment;
		this.value = value;
		this.interest = interest;
	}

	public int getInstallment() {
		return installment;
	}

	public void setInstallment(int installment) {
		this.installment = installment;
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
