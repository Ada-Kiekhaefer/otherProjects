package ada.lesson.mosh;

import java.util.Scanner;

public class ExIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temperature = 25;
		if (temperature > 30) {
			System.out.println("It's a hot day");
			System.out.println("Drink plenty of water");
		} 
		else if(temperature > 20) 
			System.out.println("It's a nice day");
		else
			System.out.println("It's cold");
				
		int income = 120_000;
		boolean hasHighIncome = (income > 100_000);
		System.out.println("hasHighIncome = " + hasHighIncome);
		
		String className = income > 100_000 ? "First Class" : "Economy";
		System.out.println(className);
		
		String role = "admin";
		if (role == "admin")
			System.out.println("You're an admin");
		else if (role == "moderator")
			System.out.println("You're a moderator");
		else 
			System.out.println("You're a guest");

		
		System.out.println("--- Ex 2 ------");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Number: ");
		int number = scanner.nextInt();
		
		if ((number % 3) == 0 && (number % 5 == 0))
			System.out.println("FizzBuzz");
		else if (number % 5 == 0)
			System.out.println("Fizz");
		else if (number % 3 == 0)
			System.out.println("Buzz");
		else
			System.out.println(number);
			
		

		
	}

}
