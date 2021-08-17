package model.entities;

public class Payment {
	
	private int installment;
	private Double value;
	
	public Payment() {
	}

	public Payment(int installment, Double value) {
		this.installment = installment;
		this.value = value;
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
	
	
	

}
