package com.bridgelab;

import static java.lang.Math.random;
public class EmpWage {
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;
    static final int EMP_WAGE_PER_HOUR = 20;

    public static void main(String[] args) {
        // Use case 3 Add part-time employee & wage

        System.out.println("Welcome to the Employees Wage ...");

        int empCheck = (int) (random() * 3);
        int empHrs = 0;
        int wage = 0;

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
        System.out.println("The Employee Wage is :: "+ wage);
    }
}
