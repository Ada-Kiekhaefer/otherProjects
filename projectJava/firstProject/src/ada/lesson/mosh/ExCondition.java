package ada.lesson.mosh;

public class ExCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean hasHighIncome = false;
		boolean hasGoodCredit = true;
		boolean hasCriminalRecord = false;
		boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;		

		
	}

}
