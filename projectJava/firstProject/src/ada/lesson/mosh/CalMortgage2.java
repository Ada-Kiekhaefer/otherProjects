package ada.lesson.mosh;

import java.text.NumberFormat;
import java.util.Scanner;

public class CalMortgage2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final byte MONTHS_IN_YEAR = 12;
		final byte PERCENT = 100;
		
		int principal = 0;		
		float annualInterest = 0;
		float monthlyInterest = 0;
		byte years = 0;
		int numberOfPayments =0;

		Scanner scanner = new Scanner(System.in);

		while(true) {
			System.out.print("Principal: ");
			principal = scanner.nextInt();
			if (principal >= 1000 && principal <= 1_000_000)
				break;
			System.out.println("Enter a number between 1,000 and 1,000,000");
		}
		
		while(true) {
			System.out.print("Annual Interest Rate: ");
			annualInterest = scanner.nextFloat();
			if (annualInterest > 0 && annualInterest < 30) {
				monthlyInterest = annualInterest / MONTHS_IN_YEAR / PERCENT;
				break;
			}
			System.out.println("Enter a value greater than 0 and less than 30");
		}		
		
		while(true) {
			System.out.print("Period (Years): ");
			years = scanner.nextByte();
			if (years > 0 && years <=30) {
				numberOfPayments = years * MONTHS_IN_YEAR;
				break;
			}
			System.out.println("Enter value between 0 and 30");		
		}
				
		double mortgage = principal 
				* monthlyInterest * Math.pow((1+monthlyInterest), (numberOfPayments))
				/(Math.pow((1+monthlyInterest), (years*12)) - 1);
		String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
		System.out.println("Mortgage: " + mortgageFormatted);		

	}

}
