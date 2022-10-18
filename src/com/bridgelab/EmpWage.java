package com.bridgelab;

import static java.lang.Math.random;
public class EmpWage {
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;
    static final int EMP_WAGE_PER_HOUR = 20;
    static final int NUM_WORKING_DAYS = 20;

    public static void main(String[] args) {
        // Use case 5 Calculating Wages for a Month

        System.out.println("Welcome to the Employees Wage ...");

        int empHrs = 0;
        int wage = 0;
        int totalSalaryPerMonth = 0;
        for (int day = 1; day <= NUM_WORKING_DAYS; day++){
            int empCheck = (int) (random() * 3);
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
            wage = empHrs * EMP_WAGE_PER_HOUR;
            totalSalaryPerMonth += wage;
        }
        System.out.println("The Employee total Wage per month :: "+ totalSalaryPerMonth);
    }
}
