public class  EmpWageBuilder{
		public static void main(String args[]){
			int IS_FULL_TIME = 1;                                   //constants
         int WAGE_PER_HOUR=20;                           //wage per hour
         int FULL_DAY_HOUR=8;                            //Number of fixed Hours perday
         int PART_TIME_HOUR=4;
         double calculateDailyWage=0;

         System.out.println("Welcome to Employee wage Computation Program");
         double empCheck=Math.floor(Math.random() * 10)%2;//computation
         if(empCheck == IS_FULL_TIME )                   //To check Employee is present or not
            System.out.println("Employee is Present");
         else
             System.out.println("Employee is not Present");

         calculateDailyWage=(FULL_DAY_HOUR*WAGE_PER_HOUR); //daily full day wage camputation
         System.out.println("Employee daily Full day wage - " +calculateDailyWage);
         calculateDailyWage=0;                             // assigning zero for computation  wage for part time
         calculateDailyWage=(PART_TIME_HOUR*WAGE_PER_HOUR); //daily part time wage camputation
         System.out.println("Employee daily Part time day wage - " +calculateDailyWage);
		}
}
