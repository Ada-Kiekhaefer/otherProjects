package ada.lesson.mosh;

import java.util.Scanner;

public class ExSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----- Ex 1 ------");		
		String role = "admin";
		
		switch (role) {
			case "admin":
				System.out.println("You're an admin");
				break;
			case "moderator":
				System.out.println("You're a moderator");
				break;
			default:
				System.out.println("You're a guest");
		
		}				

	}

}
