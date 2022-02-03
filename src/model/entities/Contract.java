package model.entities;

import java.util.Date;

public class Contract {
	
	private int number;
	private Date date;
	private Payment payment;
	
	public Contract() {
	}

	public Contract(int number, Date date) {
		super();
		this.number = number;
		this.date = date;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
	
	

}
