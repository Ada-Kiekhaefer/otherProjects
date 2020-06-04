package ada.lesson.mosh;

import java.text.NumberFormat;
import java.util.Scanner;

public class CalMortgage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final byte MONTHS_IN_YEAR = 12;
		final byte PERCENT = 100;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Principal: ");
		int principal = scanner.nextInt();

		System.out.print("Annual Interest Rate: ");
		float annualInterest = scanner.nextFloat();
		float monthlyInterest = annualInterest / MONTHS_IN_YEAR / PERCENT;

		System.out.print("Period (Years): ");
		byte years = scanner.nextByte();
		int numberOfPayments = years * MONTHS_IN_YEAR;
				
		double mortgage = principal 
				* monthlyInterest * Math.pow((1+monthlyInterest), (numberOfPayments))
				/(Math.pow((1+monthlyInterest), (years*12)) - 1);
		String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
		System.out.println("Mortgage: " + mortgageFormatted);

	}

}
