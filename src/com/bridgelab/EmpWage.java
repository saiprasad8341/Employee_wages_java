package com.bridgelab;
// UC-7 Refactor the Code to write a Class Method to Compute Employee Wage - Use Class Method and Class
import static java.lang.Math.random;
public class EmpWage {
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;
    static final int EMP_WAGE_PER_HOUR = 20;
    static final int NUM_WORKING_DAYS = 20;
    static  final int MAX_WORKING_HOURS = 100;

    public static void EMPWage() {
        int empHrs = 0;
        int wage = 0;
        int totalSalaryPerMonth = 0;
        int totalWorkingDays = 0;
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
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Employees Wage ...");

        EMPWage();
    }
}
