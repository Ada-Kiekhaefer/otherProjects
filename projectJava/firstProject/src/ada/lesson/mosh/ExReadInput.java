package ada.lesson.mosh;

import java.util.Scanner;

public class ExReadInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Age: ");
//		byte age = scanner.nextByte();
//		System.out.println("You are " + age);

		Scanner scanner = new Scanner(System.in);
		System.out.print("Name: ");
//		String name = scanner.nextLine();
		String name = scanner.nextLine().trim();
		System.out.println("My name is " + name);
		

	}

}
