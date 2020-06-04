package ada.lesson.mosh;

import java.util.Scanner;

public class ExWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---- Ex 1 ------");
		Scanner scanner = new Scanner(System.in);
		String input = "";
//		while (!input.equals("quit")) {
		while(true) {
			// make sure to have break statement with while(true)
			System.out.println("Input (quit to exit): ");
			input = scanner.next().toLowerCase();
			if (input.equals("pass"))
				continue;
			if (input.equals("quit"))
				break;
			System.out.println(input);			
		}
				
		System.out.println("---- Ex 2 ------");
		//do while loop, check condition later
		//use while loop most of the time
		
		do {
			System.out.println("Input (quit to exit): ");
			input = scanner.next().toLowerCase();
			System.out.println(input);			
		} while (!input.equals("quit"));

	}

}
