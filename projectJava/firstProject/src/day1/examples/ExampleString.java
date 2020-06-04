package day1.examples;

public class ExampleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "Tiger Wood";
		System.out.println("Hello " + x);
		System.out.println(x.toUpperCase());
		System.out.println(x.substring(2));
		System.out.println(x.substring(2,7));
		
		String age = "25";
		String salary = "7890.11";
		
		//Wrapper classes
		int a = Integer.parseInt(age)/2;
		System.out.println(a);
		double s = Double.parseDouble(salary) * 0.2;
		System.out.println(s);

	}

}
