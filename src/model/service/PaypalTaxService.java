package model.service;

import model.entities.Payment;

public class PaypalTaxService implements TaxService{

	@Override
	public Double operation(Payment payment) {
				
		return payment.getValue()*(1+payment.getInstallment()*0.01)*1.02;
	}

}
