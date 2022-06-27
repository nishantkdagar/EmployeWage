package com.wagecalculator;

import java.util.Random;

public class EmpWageCalculator {
    private final String comp;
    private final int EMP_RATE_PER_HOUR;
    private final int workingDaysPerMonth;
    private final int maxWorkingHours;
    private int totalEmpWage;
    public EmpWageCalculator(String comp, int EMP_RATE_PER_HOUR, int workingDaysPerMonth, int maxWorkingHours){
        this.comp = comp;
        this.EMP_RATE_PER_HOUR = EMP_RATE_PER_HOUR;
        this.workingDaysPerMonth = workingDaysPerMonth;
        this.maxWorkingHours = maxWorkingHours;
    }
    public void companyWage(){
        System.out.printf("%s Employee Wage details: ", comp).println();
        //local variables
        int empWage = 0, totalWage=0, workingHours = 0, empHours = 0;
        Random random = new Random();
        for (int day = 1; day<=workingDaysPerMonth && workingHours<maxWorkingHours; day++) {

            int empCheck = random.nextInt(3);
            switch (empCheck) {
                case 1:
                    System.out.printf("Day %d: Employee is Present for full day.", day).println();
                    empHours = 8;
                    break;
                case 2:
                    System.out.printf("Day %d: Employee worked for half day.", day).println();
                    empHours = 4;
                    break;
                default:
                    System.out.printf("Day %d: Employee is Absent.", day).println();
                    empHours = 0;
                    break;
            }
            empWage = empHours * EMP_RATE_PER_HOUR;
            System.out.printf("Worked: %d hours, Earned: $%d", empHours, empWage).println("\n");
            totalWage += empWage;
            workingHours += empHours;
        }
        totalEmpWage = workingHours*EMP_RATE_PER_HOUR;
        System.out.printf("The Total wage earned by %s for this month: " + "$ " + totalWage, comp).println();
        System.out.printf("Total hours worked for %s: " + workingHours, comp).println();
        System.out.println();
    }
    public String toString(){
        return "Total wage earned for the Company " + comp + " is: " + totalEmpWage;
    }
    public static void main(String args[]) {
        //Welcome message
        System.out.println("Welcome to Employee Wage Builder. \n");
        EmpWageCalculator tcs = new EmpWageCalculator("TCS", 20, 20, 100);
        tcs.companyWage();
        EmpWageCalculator microsoft = new EmpWageCalculator("Microsoft", 30, 25, 120);
        microsoft.companyWage();
        System.out.println(tcs);
        System.out.println(microsoft);
    }
}
