public class EmpWageBuilder {
	static int WAGE_PER_HOUR = 20; // WAGE PER HOUR
	static int FULL_DAY_HOUR = 8; //NUMBER OF FIXED HOURS PER DAY FOR FULL DAY 
	static int PART_TIME_HOUR = 4;//NUMBER OF FIXED HOURS PER DAY FOR HALF DAY OR PART TIME
	static int Working_DAYS_PER_MONTH = 20;// MAXIMUM NO OF WORKING DAYS PER MONTH
	static int WORKING_hOURS_PER_MONTH = 100;//MAXIMUM NUMBER OF HOURS PER MONTH
	static int workigHoursCompleted = 0; //NUMBER OF HOURS COMPLETED BY EMPLOYEE
	static int EMPLOYEE_STATUS = 1; // CONSTANT TO CHECK WHETHER EMPLOYEE PRESENT OF ABSENT
	static double calculateDailyWage = 0;//VARIABLE FOR TOTAL WAGE 
	static int workigDaysCompleted = 0; //NUMBER OF DAYS COMPLETED BY EMPLOYEE
	static int numberOfHalfDays = 0; //STORES NUMBER OF HALF DAYS
	static int numberOfFulldays = 0;//STORES NUMBER OF FULL DAYS
	static int numberofPresent = 0;//NUMBER OF PRESNTS
	static int numberOfAbsent = 0;//NNUMBBER OF ABSENTS

	// FUNCTION TO GIVE RESULT HOW MANY HOURS HE WORKS BASED ON RANDOM KEY FOR HALF DAY OR FULL DAY
	public static int getWorkPerDay(int employeeStatus) {
		int numberOfHours = 0;
	    switch (employeeStatus) {
			case 0:
				   numberOfHours = PART_TIME_HOUR;
				   break;
			case 1:
			       numberOfHours = FULL_DAY_HOUR;
				   break;
		}
					
	    return numberOfHours;
	}
	
	//CALUCLATE EMPLOYEE MONTHLY WAGE ON THE BASES OF HIS ATTANDANCE STATUS
	public static double computeEmpWage(int empAttandanceStatus) {
		if (empAttandanceStatus == EMPLOYEE_STATUS) {
			
			numberofPresent++;
			
			int empDayStatus = (int) (Math.floor(Math.random() * 10) % 2); // KEY GENRATION FOR HALF DAYS AND FULL DAYS
																	
			// TO COUNT NO OF FULL DAYS AND HALF DAYS
			if (empDayStatus == 0)
				numberOfHalfDays++;
			else
				numberOfFulldays++;

			int dayHours = EmpWageBuilder.getWorkPerDay(empDayStatus);
			workigHoursCompleted=workigHoursCompleted+dayHours;
			
			if(workigHoursCompleted>100) {
				workigHoursCompleted=100;
			}
			calculateDailyWage = calculateDailyWage + (dayHours * WAGE_PER_HOUR);
		} 

		else
			numberOfAbsent++;
		
		return calculateDailyWage;
		
	}

	// MAIN FUNCTION
	public static void main(String args[]) {
		System.out.println("Welcome to Employee wage Computation Program");
		System.out.println("--------------------------------------------------");
		// LOOP TILL CONDITION DID NOT REACH FOR TERMINATION
		while (workigDaysCompleted < Working_DAYS_PER_MONTH && workigHoursCompleted < WORKING_hOURS_PER_MONTH) {
			int empAttandanceStatus = (int) (Math.floor(Math.random() * 10) % 2);
			calculateDailyWage=EmpWageBuilder.computeEmpWage(empAttandanceStatus);
			workigDaysCompleted++;
	   }

		System.out.println("Number of days presents  - " + numberofPresent);
		System.out.println("total of days absents    - " + numberOfAbsent);
		System.out.println("total half working days  - " + numberOfHalfDays);
		System.out.println("total full working days  - " + numberOfFulldays);
		System.out.println("Number of hours completed- " +workigHoursCompleted );
		System.out.println("total wage               - " + calculateDailyWage);

  }
}


