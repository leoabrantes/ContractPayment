package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Payment;
import model.service.loan.LoanService;
import model.service.loan.TableSAC;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("LOAN AGREEMENT");
		System.out.println();
		
		System.out.print("Contract value (US$): ");
		double value = sc.nextDouble();
		System.out.print("Enter with the number of months. MAX: 360: ");
		int months = sc.nextInt();
		
			while (months < 1 || months > 360) {
				System.out.print("	Type a valid number of months (from 1 to 360): ");
				months = sc.nextInt();
			}

		
		System.out.print("Enter with the contract interest (a year). Max: 15%: ");
		double interest = sc.nextDouble();
		
			while (interest < 1 || interest > 15) {
				System.out.print("	Type a valid number (from 1 to 15): ");
				interest = sc.nextInt();
			}

		System.out.print("Choose a model contract: (1) Table PRICE or (2) Table SAC. Type a number (1/2): ");
		
		int model = sc.nextInt();
			while (model != 1 && model != 2) {
				System.out.print("Invalid number. Type again (1 or 2): ");
				model = sc.nextInt();
			}
		
		System.out.println();
		System.out.print("Contract signature date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.next());

		Contract contract = new Contract(date, model);
		
		
		contract.setPayment(new Payment(months, value, interest));
		
		System.out.println();
		System.out.println();

		
		contract.summaryContract();
		
		System.out.print("Would you like to get information about the all installments? (Y/N): ");
		
		char type = sc.next().charAt(0);
		
		
		while ((type != 'Y') && (type != 'N')) {
			System.out.println();
			System.out.print("Invalid value! Would you like to get information about the all installments? (Y/N):  ");
			type = sc.next().charAt(0);
		}
		
		if(type == 'Y') {
			contract.paymentContract();
		}

		sc.close();
	}

}
