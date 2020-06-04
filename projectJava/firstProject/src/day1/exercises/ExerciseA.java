package day1.exercises;

public class ExerciseA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salary = 78789.5;
		double tax = 0.0;
		if (salary <= 15000) {
			tax = 0.15 * salary; 
		} else if(salary <= 40000) {
			tax = 0.2 * salary;
		} else {
			tax = 0.3 * salary;
		}
		System.out.println("Tax = " + tax);

	}

}
