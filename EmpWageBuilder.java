/*
 *THIS PROGRM SHOWS THE HOW INTERFACE WORKKS 
 *HERE EACH COMPANY CAN HAVE THEIR OWN DATAT AND THE LOGIC TO CALCULATE EMPLOYEWAGE 
 *IN PROGRAM IT CAN BE SEE THAT INTERFACE computeEmpWage() METHOD IS OVERRIDE IN DIFFEENT CLASSES AND IMPLEMENTED 
 *ACCORDIDING INDIVIDUALS OWN LOGIC
 */

//INTERFACE 
interface CompanyEmpWage {
	public int computeEmpWage();
}

//AIRTEL COMPANY HAVING ITS OWN LOGIC AND DATA FOR ITS EMPLOYEE WAGE 
class Airtel implements CompanyEmpWage {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 2;
	public static final int MAX_HRS_IN_MONTH = 10;
	//IMPLEMENTATION DECLARED IN INTERFACE OF COMPPUTE_EMP_WAGE METHOD FOR COMPANY OWN PURPOSE
	@Override
	public int computeEmpWage() {
		// variable
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		System.out.println("            Wellcome to Airtel wage calculater     ");
		System.out.println("----------------------------------------------------");
		// COMPUTATION
		while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
			totalWorkingDays++;
			int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
			switch (empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 4;
			}
			totalEmpHrs += empHrs;
			System.out.println("Days:" + totalWorkingDays + " Emp hrs" + empHrs);
		}
		int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
		System.out.println("total Emp Wage : =" + totalEmpWage);
		return totalEmpWage;
	}
}

//DMART COMPANY HAVING ITS OWN LOGIC AND DATA FOR ITS EMPLOYEE WAGE 
class Dmart implements CompanyEmpWage {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 30;
	public static final int NUM_OF_WORKING_DAYS = 5;
	public static final int MAX_HRS_IN_MONTH = 20;
	
	//IMPLEMENTATION DECLARED IN INTERFACE OF COMPPUTE_EMP_WAGE METHOD FOR COMPANY OWN PURPOSE
	@Override
	public int computeEmpWage() {
		// variable
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		System.out.println("            Wellcome to Dmart wage calculater     ");
		System.out.println("----------------------------------------------------");
		// COMPUTATION
		while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
			totalWorkingDays++;
			int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
			switch (empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 4;
			}
			totalEmpHrs += empHrs;
			System.out.println("Days:" + totalWorkingDays + " Emp hrs" + empHrs);
		}
		int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
		System.out.println("total Emp Wage : =" + totalEmpWage);
		return totalEmpWage;

	}

}

//MAIN CLASS OR CONTROLER CLASS
public class EmpWageBuilder {
	public static void main(String args[]) {
		Airtel airtel = new Airtel();
		airtel.computeEmpWage();
		Dmart dmart = new Dmart();
		dmart.computeEmpWage();
	}
}
