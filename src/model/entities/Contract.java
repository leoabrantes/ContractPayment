package model.entities;

import java.util.Date;

public class Contract {
	
	private int number;
	private Date date;
	
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
	

}
