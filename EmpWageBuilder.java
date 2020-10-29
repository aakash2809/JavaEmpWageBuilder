public class  EmpWageBuilder{
	static int WAGE_PER_HOUR = 20; // wage per hour
	static int FULL_DAY_HOUR = 8; // Number of fixed Hours per day for full day
	static int PART_TIME_HOUR = 4;// Number of fixed Hours per day for part time
	static int Working_DAYS_PER_MONTH = 20;//
	static double calculateDailyWage = 0;// vairable for total wage calculation
	static int totalWorkingDays = 0;// total working days

	// function to give result for no.of hours done for work done
	public static int getWorkPerDay(int employeeStatus) {
		int workDone = 0;
		switch (employeeStatus) {
		case 0:
			workDone = PART_TIME_HOUR;
			break;
		case 1:
			workDone = FULL_DAY_HOUR;
			break;
		}
		return workDone;
	}

	// main function
	public static void main(String args[]) {

		int numberOfHalfDays = 0;
		int numberOfFulldays = 0;
		int count = 0;

		System.out.println("Welcome to Employee wage Computation Program");

		// loop till working days per month
		while (count < Working_DAYS_PER_MONTH) {
			int employeeStatus = (int) (Math.floor(Math.random() * 10) % 2); // key genration for half day or full day

			// counting number of full days and half days
			if (employeeStatus == 0)
				numberOfHalfDays++;
			else
				numberOfFulldays++;

			int dayHours = EmpWageBuilder.getWorkPerDay(employeeStatus);
			calculateDailyWage = calculateDailyWage + (dayHours * WAGE_PER_HOUR);
			count++;

		}

		totalWorkingDays = numberOfFulldays + numberOfHalfDays;// total working days computation

		System.out.println("total half working days - " + numberOfHalfDays);
		System.out.println("total full working days - " + numberOfFulldays);
		System.out.println("total working days      - " + totalWorkingDays);
		System.out.println("total wage              - " + calculateDailyWage);

	}


}
