public class EmpWageBuilder {
	static int WAGE_PER_HOUR = 20; // wage per hour
	static int FULL_DAY_HOUR = 8; // Number of fixed Hours per day for full day
	static int PART_TIME_HOUR = 4;// Number of fixed Hours per day for part time
	static int Working_DAYS_PER_MONTH = 20;// Maximum number of working days in a month
	static int WORKING_hOURS_PER_MONTH = 100;//Maximum number of working hours in month
	static int workigHoursCompleted = 0; //Number of hours completed by Employee
	static int EMPLOYEE_STATUS = 1; // constant to check whether present or absent
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
					int numberofPresent = 0;
					int numberOfAbsent = 0;

					System.out.println("Welcome to Employee wage Computation Program");
					System.out.println("--------------------------------------------------");
					// loop till working days and hours per month 
					while (count < Working_DAYS_PER_MONTH && workigHoursCompleted < WORKING_hOURS_PER_MONTH) {

						double empCheck = Math.floor(Math.random() * 10) % 2;// computation

						if (empCheck == EMPLOYEE_STATUS) {
							numberofPresent++;
							
							int employeeStatus = (int) (Math.floor(Math.random() * 10) % 2); // key genration for half day or full
																					
							// counting number of full days and half days
							if (employeeStatus == 0)
								numberOfHalfDays++;
							else
								numberOfFulldays++;

							int dayHours = EmpWageBuilder.getWorkPerDay(employeeStatus);
							calculateDailyWage = calculateDailyWage + (dayHours * WAGE_PER_HOUR);
						} 
			
						else
							numberOfAbsent++;
							count++;

		}

		
		System.out.println("Number of days presents  - " + numberofPresent);
		System.out.println("total of days absents    - " + numberOfAbsent);
		System.out.println("total half working days  - " + numberOfHalfDays);
		System.out.println("total full working days  - " + numberOfFulldays);
		System.out.println("total wage               - " + calculateDailyWage);

	}


}


