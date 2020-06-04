package day2.classandobject;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initialize objects
		Employee alex = new Employee();
		Employee linda = new Employee();

		alex.salary = 90000;
		alex.bonus = 15000;
		alex.calculateTotalPay();
		
		linda.salary = 110000;
		linda.bonus = 30000;
		linda.calculateTotalPay();

	}

}
