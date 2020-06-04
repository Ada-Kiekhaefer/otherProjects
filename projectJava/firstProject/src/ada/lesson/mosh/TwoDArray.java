package ada.lesson.mosh;

import java.util.Arrays;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] numbers = new int [2][3];
		numbers[0][0] = 1;
		System.out.println(Arrays.deepToString(numbers));
		
		int [][] num2 = {{1,2,3},{4,5,6}};
		System.out.println(Arrays.deepToString(num2));
 
	}

}
