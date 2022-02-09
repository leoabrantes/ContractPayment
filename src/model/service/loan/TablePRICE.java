package model.service.loan;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import model.entities.Installment;

public class TablePRICE implements LoanService{
	
	private double value;
	private double interest;
	private int months;
	
		
	public TablePRICE(double value, double interest, int months) {
		this.value = value;
		this.interest = interest;
		this.months = months;
	}
	
	
	public double getValue() {
		return value;
	}


	public void setValue(double value) {
		this.value = value;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public int getMonths() {
		return months;
	}
	
	public void setMonths(int months) {
		this.months = months;
	}

	
	List<Installment> list = new ArrayList<>();
	
	Calendar cal = Calendar.getInstance();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	@Override
	public void operation() {
		
		double interestValue = interest/(100*12);
		double totalValue =  value*interestValue/(1-1/(Math.pow((1+interestValue),months)));
		double debt = value;
		
		System.out.println();
		System.out.println();
		
		for(int i=1; i<=months; i++) {
			
			cal.add(Calendar.MONTH, 1);
			String dueDate = sdf.format(cal.getTime());
			
			interestValue = debt*(interest/(100*12));
			debt = debt + interestValue - totalValue;
			System.out.println(new Installment(dueDate, totalValue, interestValue, (totalValue-interestValue), debt, i));
			System.out.println();
			
		}
		
	}
	
	
	@Override
	public double totalPaid() {

		double interestValue = interest/(100*12);
		double totalValue =  value*interestValue/(1-1/(Math.pow((1+interestValue),months)));

		return totalValue*months;
		
	}

	

	@Override
	public String toString() {
		return "Table PRICE";
	}


}
