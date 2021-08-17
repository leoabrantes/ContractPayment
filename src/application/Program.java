package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Payment;
import model.service.ContractService;
import model.service.GooglePayService;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.next());
			

		System.out.print("Contract value: ");
		double value = sc.nextDouble();
		
		
		System.out.print("Enter Number of Installments: ");
		int installments = sc.nextInt();
		
		Payment payment = new Payment(installments, value);
		Contract contract = new Contract(number, date);
		
		ContractService cs = new ContractService(payment, contract, new GooglePayService());
		
		cs.operation();
		
		sc.close();
	}

}
