package empwage;

public class empWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Computation Program");

		int IS_FULL_TIME=1;
		int EMP_RATE_PER_HOUR=20;
		int empHrs=0;
		int empWage=0;
		double empCheck = Math.floor(Math.random()*10)%2;
		if(empCheck == IS_FULL_TIME)
			empHrs=8;
		empWage=empHrs*EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: "+empWage);
	}

}
