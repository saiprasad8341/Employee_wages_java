package com.bridgelab;
// UC-8 Compute Employee Wage for multiple companies
import static java.lang.Math.random;
public class EmpWage {
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;
//    static final int EMP_WAGE_PER_HOUR = 20;
//    static final int NUM_WORKING_DAYS = 20;
//    static  final int MAX_WORKING_HOURS = 100;

    public static void EMPWage(String company, int EMP_WAGE_PER_HOUR, int NUM_WORKING_DAYS, int MAX_WORKING_HOURS) {
        int empHrs = 0;
        int wage = 0;
        int totalSalaryPerMonth = 0;
        int totalWorkingDays = 0;

        System.out.println("Company name :::: "+company);
        while (totalWorkingDays <= NUM_WORKING_DAYS && totalWorkingDays <= MAX_WORKING_HOURS){
            int empCheck = (int) (random() * 3);
            totalWorkingDays++;
            switch (empCheck){
                case IS_FULL_TIME :
                    System.out.println("Employee is Present.");
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    System.out.println("Employee is Part time present");
                    empHrs = 4;
                    break;
                default:
                    System.out.println("Employee is Absent");
                    empHrs = 0;
            }
            wage += empHrs;
            System.out.println("Total Working Hours :: "+wage+" \nTotal Working Days ::"+totalWorkingDays);
        }
        totalSalaryPerMonth = wage * EMP_WAGE_PER_HOUR;
        System.out.println("The Employee total Wage per month :: "+ totalSalaryPerMonth);
        System.out.println("----------------------------------------");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Employees Wage ...");

        EMPWage("Google", 20, 20, 100);
        EMPWage("FaceBook", 20, 10, 50);
    }
}
