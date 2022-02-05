package model.entities;

import java.util.Date;

import model.service.ContractService;
import model.service.loan.LoanService;
import model.service.loan.TablePRICE;
import model.service.loan.TableSAC;

public class Contract {
	
	private int model;
	private Date date;
	private Payment payment;
	
	public Contract() {
	}

	public Contract(Date date, int model) {
		super();
		this.model = model;
		this.date = date;
	}
	

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
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
	

	
	public LoanService modelContract() {
		if(model == 1) {
			return new TablePRICE();
		}
		else {
			return new TableSAC();
		}
	}
	
	
	ContractService cs = new ContractService(this, modelContract());
	
	
	public void summaryContract() {
		
		cs.summary();
		
	}
	
	

}
