package com.bridgelab;
// UC-9 Ability to save the Total Wage for Each Company
import static java.lang.Math.random;
public class EmpWage {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
//    static final int EMP_WAGE_PER_HOUR = 20;
//    static final int NUM_WORKING_DAYS = 20;
//    static  final int MAX_WORKING_HOURS = 100;
    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;
    private int totalEmpWage;

    public EmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }
    public void computeEmpWage() {

        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays <= numOfWorkingDays){
            int empCheck = (int) (random() * 3);
            totalWorkingDays++;
            switch (empCheck) {
                case IS_FULL_TIME -> {
                    System.out.println("Employee is Present.");
                    empHrs = 8;
                }
                case IS_PART_TIME -> {
                    System.out.println("Employee is Part time present");
                    empHrs = 4;
                }
                default -> {
                    System.out.println("Employee is Absent");
                    empHrs = 0;
                }
            }
            totalEmpHrs += empHrs;
            System.out.println("Total Working Hours :: "+empHrs+" \nTotal Working Days ::"+totalWorkingDays);
        }
        totalEmpWage = totalEmpHrs * empRatePerHour;
    }

    public String toString() {
            return "Total Emp Wage for Company :: " +company+ " is :: " +totalEmpWage;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Employees Wage ...");
        EmpWage jio = new EmpWage("jio", 20,2, 10);
        EmpWage DMart = new EmpWage("DMart", 10, 4, 20);
        jio.computeEmpWage();
        System.out.println(jio);
        DMart.computeEmpWage();
        System.out.println(DMart);
    }
}
