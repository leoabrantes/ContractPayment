package model.service;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import model.entities.Contract;
import model.entities.Payment;


public class ContractService {
	
	private Contract contract;
	private TaxService taxService;
	
	public ContractService() {
	}
	
	public ContractService(Contract contract, TaxService taxService) {
		this.contract = contract;
		this.taxService = taxService;
	}


	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}
	
		
	public static void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public void summary() {
		
		clearScreen();
		
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(contract.getDate());
		
		System.out.println();
		System.out.println();
		
		System.out.println("Summary: ");
		
		System.out.printf("%s%d","Contract: ", contract.getNumber());
		
		System.out.println();
			
		System.out.println("Installments: ");
		
		int p = contract.getPayment().getInstallment();
		double value = contract.getPayment().getValue();
		double gross = 0;
		
		for(int i= 1; i <= p; i++ ) {
			cal.add(Calendar.MONTH, 1);
			System.out.printf("%s - %.2f %n", sdf.format(cal.getTime()), taxService.operation(i, value));
			gross += taxService.operation(i, value);
		}
		
		System.out.println();
		
		System.out.printf("%s%.2f%n", "Gross value: ", gross);
		System.out.printf("%s%.2f%n", "Interest: ", (gross-value));
		
				
	}
	
	

}
