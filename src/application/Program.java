package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Payment;

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
		int interest = sc.nextInt();
		
			while (interest < 1 || interest > 15) {
				System.out.print("	Type a valid number (from 1 to 15): ");
				interest = sc.nextInt();
			}

		System.out.println();
		System.out.println("Choose a model to loan contract: ");
		System.out.println("	1 - Table PRICE ");
		System.out.println("	2 - Table SAC ");
		
		System.out.print("Type a number (1 or 2): ");
		
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
		
		System.out.println("Would you like to print all the payment table (Y/N)? ");
		
		contract.paymentContract();

		sc.close();
	}

}
