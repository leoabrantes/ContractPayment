package model.service.loan;

public class TableSAC implements LoanService{
	
	private double value;
	private double interest;
	private int months;
	
		
	public TableSAC(double value, double interest, int months) {
		super();
		this.value = value;
		this.interest = interest;
		this.months = months;
	}
	
	list<>
	
	
	@Override
	public void operation() {
		for(int i=1; i<=months; i++) {
			
			System.out.println();
			
		}
		
	}

	@Override
	public String toString() {
		return "Table SAC";
	}


}
