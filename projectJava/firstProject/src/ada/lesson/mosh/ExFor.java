package ada.lesson.mosh;

import java.util.Scanner;

public class ExFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if number if iteration is known, use for loop
		System.out.println("---- Ex 1 ------");
		for (int i = 0; i < 5; i++)
			System.out.println("Hello World " + i);

		System.out.println("---- Ex 2 ------");
		String[] fruits = {"Apple", "Mango", "Orange"};
		
		for (int i = 0; i < fruits.length; i++)
			System.out.println(fruits[i]);
		
		System.out.println("---- Ex 3 ------");
		for (String fruit : fruits)
			System.out.println(fruit);


	}

}
