package model.service;

public class TablePrice implements LoanService{
	
	private double fee = 2;     // Google Pay Fee = (2% of the total value)

	@Override
	public Double operation(double value) {
				
		return value*fee/100;
	}

}
