package day1.examples;

public class ExampleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10, 20, 20, 40, 50};
		
		System.out.println(a[0] + " " + a[4]);
		
		//enhance for
		for(int temp : a) {
			System.out.println(temp);
		}
		
		System.out.println("------");
		int[] x = new int[5];
		x[1] = 12;
		x[4] = 3;								
		for(int temp2 : x) {
			System.out.println(temp2);
		}
		
		System.out.println("------");
		String[] st = {"one", "two", "three"};
		for(String temp3 : st) {
			System.out.println(temp3);
		}
		
		System.out.println("------");
		String[] st1 = new String[5];
		st1[0] = "12";
		st1[2] = "15";
		for(String temp4 : st1) {
			System.out.println(temp4);
		}
				

	}

}
