package day2.classandobject;

// create class Employee, a class is a template for an object 
public class Employee {
	double salary;
	double bonus;
	
	//create a method calculateTotalPay
	void calculateTotalPay(){
		double totalPay = salary + bonus;
		System.out.println("Total pay = " + totalPay);
	}

}
