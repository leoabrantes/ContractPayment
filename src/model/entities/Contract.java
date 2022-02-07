package model.entities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import model.service.loan.LoanService;
import model.service.loan.TablePRICE;
import model.service.loan.TableSAC;

public class Contract {
	
	Calendar cal = Calendar.getInstance();
	SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
	
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
			return new TablePRICE(payment.getValue(), payment.getInterest(), payment.getMonths());
		}
		else {
			return new TableSAC(payment.getValue(), payment.getInterest(), payment.getMonths());
		}
	}
	
	
	public static void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
	
	
	
	public void summaryContract() {
		
		cal.setTime(getDate());
		
		clearScreen();
		
		System.out.println("SUMMARY: ");
		
		System.out.println();
		
		System.out.printf("%s%.2f%n", "	Contract value: $", getPayment().getValue());
		System.out.println("	Months: " + getPayment().getMonths());
		System.out.println("	Interest: " + getPayment().getInterest() + "% a year");
		System.out.println("	Contract signature date: " + sdf1.format(getDate()));
		System.out.println("	Contract model: " + modelContract());
		System.out.println();
		System.out.printf("%s%.2f%n", "	TOTAL PAID: $", modelContract().totalPaid());
		System.out.printf("%s%.2f%n", "	Interest: $", (modelContract().totalPaid() - getPayment().getValue()));
		System.out.println();
		
		System.out.println();
		
		
	}

	public void paymentContract() {
		
		modelContract().operation();
		
	}

}
