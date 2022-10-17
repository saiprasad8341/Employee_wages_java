package com.bridgelab;

import static java.lang.Math.random;

public class EmpWage {
    public static void main(String[] args) {
        System.out.println("Welcome to the Employees Wage ...");
        int empCheck = (int) (random() * 2);
        if (empCheck == 1){
            System.out.println("Employee is Present.");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}
