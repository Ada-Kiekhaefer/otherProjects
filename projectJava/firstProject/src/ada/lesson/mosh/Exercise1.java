package ada.lesson.mosh;

import java.util.Arrays;

public class Exercise1 {
	public static void main (String [] args) {
		int[] numbers = {1, 3, 4, 5, 2};
		System.out.println(numbers.length);
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}

}
