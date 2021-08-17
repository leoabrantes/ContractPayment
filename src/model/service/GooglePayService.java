package model.service;

public class GooglePayService implements TaxService{

	@Override
	public Double operation(int installment, double value) {
				
		return value*(1+installment*0.01)*1.02;
	}

}
