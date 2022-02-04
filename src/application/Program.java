package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Payment;
import model.service.ContractService;
import model.service.loan.TablePRICE;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("LOAN AGREEMENT");
		System.out.println();

		System.out.println("Choose a model of loan contract: ");
		
		System.out.println("1 - Table PRICE ");
		System.out.println("2 - Table SAC ");
		System.out.println();
		
		System.out.print("Type a number (1 or 2): ");
		int type = sc.nextInt();
			while (type != 1 || type != 2) {
				System.out.print("Invalid number. Type again (1 or 2): ");
				type = sc.nextInt();
			}
		
		
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.next());

		System.out.print("Contract value (US$): ");
		double value = sc.nextDouble();
		System.out.print("Enter with the number of installments (from 1 to 10): ");
		int n = sc.nextInt();
		
			while (n < 1 || n > 10) {
				System.out.print("Type a valid installments number (from 1 to 10): ");
				n = sc.nextInt();
			}
		
		System.out.print("Enter the contract interest a month (maximum: 10%): ");
		int interest = sc.nextInt();
		
			while (n <= 0 || n > 10) {
				System.out.print("Type a valid installments number (from 1 to 10): ");
				n = sc.nextInt();
			}

		Contract contract = new Contract(number, date);
		contract.setPayment(new Payment(n, value, interest));

		ContractService cs = new ContractService(contract, new TablePRICE());

		cs.summary();

		sc.close();
	}

}
