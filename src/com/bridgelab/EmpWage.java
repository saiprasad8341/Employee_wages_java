package com.bridgelab;
// UC-11 Ability to manage Employee Wage of multiple companies using Interface approach
import static java.lang.Math.random;
class EmpWage implements EmpInterface {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    private int numOfCompany = 0;
    private CompanyEmpWage[] companyEmpWagesArray;

    public EmpWage(){
        companyEmpWagesArray = new CompanyEmpWage[5];
    }

    private void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth){
        companyEmpWagesArray[numOfCompany] = new CompanyEmpWage(company,empRatePerHour,numOfWorkingDays,maxHoursPerMonth);
        numOfCompany++;
    }

    public void totalEmpWage() {

        for (int i = 0; i < numOfCompany; i++ ){
            companyEmpWagesArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWagesArray[i]));
            System.out.println(companyEmpWagesArray[i]);
        }
    }

    private int computeEmpWage(CompanyEmpWage companyEmpWage) {

        int empHrs, totalEmpHrs = 0, totalWorkingDays = 0;
        while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays <= companyEmpWage.numOfWorkingDays){
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
        return totalEmpHrs * companyEmpWage.empRatePerHour;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Employees Wage ...");
        EmpWage empWage = new EmpWage();
        empWage.addCompanyEmpWage("jio", 20,2, 20);
        empWage.addCompanyEmpWage("DMart", 20, 1, 20);
        empWage.totalEmpWage();
    }
}
