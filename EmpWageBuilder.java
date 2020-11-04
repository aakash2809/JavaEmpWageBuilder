import java.util.ArrayList;
import java.util.List;

/*
 *THIS PROGRM SHOWS THE HOW INTERFACE WORKKS 
 *HERE EACH COMPANY CAN HAVE THEIR OWN DATAT AND THE LOGIC TO CALCULATE EMPLOYEWAGE 
 *IN PROGRAM IT CAN BE SEE THAT INTERFACE computeEmpWage() METHOD IS OVERRIDE IN DIFFEENT CLASSES AND IMPLEMENTED 
 *ACCORDIDING INDIVIDUALS OWN LOGIC
 *AFTER CALUCLATING WAGES ARE GOING TO BE STRORED IN ARRAYLIST 
 *PRINT TOTAL WAGE WITH DAILY WAGE BASED ON EMPLOYEE PRESENSE STATUS
 */

//INTERFACE 
interface CompanyEmpWage {
	public void computeEmpWage();
}

//AIRTEL COMPANY HAVING ITS OWN LOGIC AND DATA FOR ITS EMPLOYEE WAGE 
class Airtel implements CompanyEmpWage {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 2;
	public static final int MAX_HRS_IN_MONTH = 10;
	private int totalEmpWage;
	private int dailyWage[] = new int[100];

	// IMPLEMENTATION DECLARED IN INTERFACE OF COMPPUTE_EMP_WAGE METHOD FOR COMPANY
	// OWN PURPOSE
	@Override
	public void computeEmpWage() {
		// variable
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0, index = 0;

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
			dailyWage[index] = empHrs * EMP_RATE_PER_HOUR;
			index++;
		}
		this.totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;

	}

	@Override
	public String toString() {
		System.out.println("");
		System.out.println("Airtel: ");
		for (int i = 0; i < NUM_OF_WORKING_DAYS; i++) {
			int j = i + 1;
			// PRINTING DAY AND CORRESPONDING WAGE BASED ON NUMBER OF HOURS HE WORKED
			System.out.println("Day:" + j + "  Wage " + dailyWage[i]);
		}
		return "totalEmpWage=" + totalEmpWage;
	}
}

//DMART COMPANY HAVING ITS OWN LOGIC AND DATA FOR ITS EMPLOYEE WAGE 
class Dmart implements CompanyEmpWage {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 30;
	public static final int NUM_OF_WORKING_DAYS = 5;
	public static final int MAX_HRS_IN_MONTH = 20;
	private int totalEmpWage;
	private int dailyWage[] = new int[100];

	// IMPLEMENTATION DECLARED IN INTERFACE OF COMPPUTE_EMP_WAGE METHOD FOR COMPANY
	// OWN PURPOSE
	@Override
	public void computeEmpWage() {
		// variable
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0, index = 0;
		System.out.println("");
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
			dailyWage[index] = empHrs * EMP_RATE_PER_HOUR;
			index++;
		}
		this.totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
	}

	@Override
	public String toString() {
		System.out.println("");
		System.out.println("Demart :");
		for (int i = 0; i < NUM_OF_WORKING_DAYS; i++) {
			int j = i + 1;
			// PRINTING DAY AND CORRESPONDING WAGE BASED ON NUMBER OF HOURS HE WORKED
			System.out.println("Day:" + j + " Wage " + dailyWage[i]);
		}
		return "totalEmpWage=" + totalEmpWage;
	}
}

//MAIN CLASS OR CONTROLER CLASS
public class EmpWageBuilder {

	// SHOW EMP WAGES OF DIFFERENT COMPANIES
	public static void showCompniesEmpWages(List companiesWageDetail) {
		for (Object a : companiesWageDetail) {
			System.out.println(a);
		}
	}

	// MAIN FUNCTION
	public static void main(String args[]) {

		ArrayList companiesWageDetail = new ArrayList();

		Airtel airtel = new Airtel();
		airtel.computeEmpWage();

		Dmart dmart = new Dmart();
		dmart.computeEmpWage();

		companiesWageDetail.add(airtel);
		companiesWageDetail.add(dmart);

		System.out.println("");
		System.out.println("         All Compnies Employee wages along with daily wages       ");
		System.out.println("---------------------------------------------------------------------");
		showCompniesEmpWages(companiesWageDetail);

	}
}
