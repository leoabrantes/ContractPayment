package model.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import model.entities.Contract;
import model.entities.Payment;

public class ContractService {
	
	private Payment payment;
	private Contract contract;
	private TaxService taxService = new PaypalTaxService();
	
	public ContractService() {
	}
	
	public ContractService(Payment payment, Contract contract) {
		this.payment = payment;
		this.contract = contract;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}
	
	List<Date> list = new ArrayList<>();
	List<Double> intallments = new ArrayList<>();
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public double operation() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(contract.getDate());
			
		System.out.println("Installments: ");
		
		int p = payment.getInstallment();
		double value = payment.getValue()/p;
		
		for(int i= 1; i <= p; i++ ) {
			
			cal.add(Calendar.MONTH, 1);
			System.out.println(sdf.format(cal.getTime()) + " - " + taxService.operation(i, value));
			
		}
		
				
		
		return 0;
	}
	

}
