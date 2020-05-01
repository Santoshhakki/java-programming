public class EmpWageBuilderWhile {
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	public static final int EMP_RATE_PER_HOUR=20;
	public static final int NUM_OF_WORKING_DAYS=2;
	public static final int MAX_HOURS_IN_MONTH=10;

	public static void main(String[] args) {

		int empWage = 0, totalEmpHrs = 0, totalEmpWage = 0; totalWorkingDays = 0;

		while(totalEmpHrs <= MAX_HOURS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
			int empHrs=0;
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;

			switch (empCheck) {

				case IS_FULL_TIME:
					empHrs=8;
					break;
				case IS_PART_TIME:
					empHrs=4;
					break;
				default:
					empHrs=0;
					//System.out.println("employee is absent");
			}
			totalEmpHrs += empHrs;
			empWage = empHrs * EMP_RATE_PER_HOUR;
			totalEmpWage += empWage;
			System.out.println("Emp wage: " +empWage);
		}
		System.out.println("Total Emp Wage : " + totalEmpWage);
	}
}
