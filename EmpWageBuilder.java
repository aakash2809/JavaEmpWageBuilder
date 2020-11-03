import java.util.ArrayList;
class CompanyEmpWage {
	private static final int PART_TIME_HOUR =4;//NUMBER OF FIXED HOURS PER DAY FOR HALF DAY OR PART TIME
	private static final int FULL_DAY_HOUR = 8;//NUMBER OF FIXED HOURS PER DAY FOR FULL DAY 
	private static final int EMPLOYEE_STATUS = 1; // CONSTANT TO CHECK WHETHER EMPLOYEE PRESENT OF ABSENT
	private String company;//COMPANYNAME
	private int Working_DAYS_PER_MONTH;// MAXIMUM NO OF WORKING DAYS PER MONTH
	private int WAGE_PER_HOUR;// WAGE PER HOUR
	private int WORKING_HOURS_PER_MONTH;//MAXIMUM NUMBER OF HOURS PER MONTH
	
	//DEFAULT CONSTRUCTOR
	public CompanyEmpWage() {

	}
	
	//CONSTRUCTOR FOR ASSIGNING WAGE DATA FOR SPECIFIC COMPANY
	public CompanyEmpWage(String company, int working_DAYS_PER_MONTH,int WORKING_HOURS_PER_MONTH, int WAGE_PER_HOUR) {
		this.company = company;
		this.Working_DAYS_PER_MONTH = working_DAYS_PER_MONTH;
		this.WAGE_PER_HOUR = WAGE_PER_HOUR;
		this.WORKING_HOURS_PER_MONTH = WORKING_HOURS_PER_MONTH;
	}

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
	public void computeEmpWage() {
		int workigHoursCompleted = 0;
		int workigDaysCompleted = 0;
		int numberOfPresent = 0;
		int numberOfAbsent = 0;
		int numberOfHalfDays = 0;
		int numberOfFulldays = 0;
		int calculateDailyWage=0;
		
		// LOOP TILL CONDITION DID NOT REACH FOR TERMINATION
		while (workigDaysCompleted < Working_DAYS_PER_MONTH && workigHoursCompleted < WORKING_HOURS_PER_MONTH) {
			int empAttandanceStatus = (int) (Math.floor(Math.random() * 10) % 2);
			if (empAttandanceStatus == EMPLOYEE_STATUS) {
				
				numberOfPresent++;
				int empDayStatus = (int) (Math.floor(Math.random() * 10) % 2); // KEY GENRATION FOR HALF DAYS AND FULL DAYS
																		
				// TO COUNT NO OF FULL DAYS AND HALF DAYS
				if (empDayStatus == 0)
					numberOfHalfDays++;
				else
					numberOfFulldays++;

				int dayHours = CompanyEmpWage.getWorkPerDay(empDayStatus);
				workigHoursCompleted=workigHoursCompleted+dayHours;
				
				if(workigHoursCompleted>this.WORKING_HOURS_PER_MONTH) {
					workigHoursCompleted=this.WORKING_HOURS_PER_MONTH;
				}
			calculateDailyWage = calculateDailyWage + (dayHours * WAGE_PER_HOUR);
			} 

			else
				numberOfAbsent++;
			
			workigDaysCompleted++;
			
			}
		 }
	}

	public class EmpWageBuilder {
		public static void main(String[] args) {
		ArrayList<CompanyEmpWage> empWage=new ArrayList<CompanyEmpWage>();
		CompanyEmpWage Dmart=new CompanyEmpWage("Dmart",20,100,20);
		CompanyEmpWage Airtel=new CompanyEmpWage("Airtel",40,200,30);
		Dmart.computeEmpWage();
		Airtel.computeEmpWage();
		empWage.add(Dmart);
		empWage.add(Airtel);
	}
}

