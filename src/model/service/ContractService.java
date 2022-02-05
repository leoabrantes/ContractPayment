package model.service;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import model.entities.Contract;
import model.entities.Payment;
import model.service.loan.LoanService;


public class ContractService {
	
	private Contract contract;
	private LoanService loanService;
	
	Calendar cal = Calendar.getInstance();
	
	SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

	
		
	public ContractService() {
	}
	
	public ContractService(Contract contract, LoanService loanService) {
		this.contract = contract;
		this.loanService = loanService;
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
		cal.setTime(contract.getDate());
		
		clearScreen();
		
		System.out.println("Summary: ");
		
		System.out.println();
		
		System.out.printf("%s%.2f%n", "	Contract value: $", contract.getPayment().getValue());
		System.out.println("	Months: " + contract.getPayment().getMonths());
		System.out.println("	Interest: " + contract.getPayment().getInterest() + "% a year");
		System.out.println("	Contract signature date: " + sdf1.format(contract.getDate()));
		System.out.println("	Contract model: " + loanService);
		
		System.out.println();
		
	}

	public void payment() {
		
		loanService.operation();
		
//		for(int i= 1; i <= p; i++ ) {
//			cal.add(Calendar.MONTH, 1);
//			System.out.printf("%s - %.2f %n", sdf.format(cal.getTime()), installmentCalc() );
//		}
//		
//		System.out.println();
//		
//		System.out.printf("%s%.2f%n", "Gross value: ", gross);
//		System.out.printf("%s%.2f%n", "Interest: ", gross-value;
		
	}
	


}
