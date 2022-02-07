package model.service.loan;

public class TablePRICE implements LoanService{
	
	private double value;
	private double interest;
	private int months;
	
	
		
	public TablePRICE(double value, double interest, int months) {
		super();
		this.value = value;
		this.interest = interest;
		this.months = months;
	}
	

	@Override
	public void operation() {
		
			
		
		
		return;
	}

	@Override
	public String toString() {
		return "Table PRICE";
	}
	
	

	

}
