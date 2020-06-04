package ada.lesson.mosh;

import java.text.NumberFormat;

public class ExFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		NumberFormat currency = NumberFormat.getCurrencyInstance();
//		String result = currency.format(1234567.891);
//		System.out.println(result);

		String result = NumberFormat.getPercentInstance().format(0.1);
		System.out.println(result);
		

	}

}
