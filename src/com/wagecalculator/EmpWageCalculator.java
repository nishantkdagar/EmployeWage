package com.wagecalculator;

import java.util.Random;

public class EmpWageCalculator {
    public static int empHours = 0;
    public static void fullTimeEmployee(int day){
        System.out.printf("Day %d: Employee is Present for full day.", day).println();
        empHours = 8;
    }
    public static void partTimeEmployee(int day){
        System.out.printf("Day %d: Employee worked for half day.", day).println();
        empHours = 4;
    }
    public static void absentEmployee(int day){
        System.out.printf("Day %d: Employee is Absent.", day).println();
        empHours = 0;
    }
    public static void companyWage(String comp, int EMP_RATE_PER_HOUR, int workingDaysPerMonth, int maxWorkingHours ){
        int empWage = 0, totalWage=0, workingHours = 0;
        Random random = new Random();
        //Calculating the total wage per month using loops
        for (int day = 1; day<=workingDaysPerMonth && workingHours<maxWorkingHours; day++) {

            int empCheck = random.nextInt(3);
            switch (empCheck) {
                case 1:
                    fullTimeEmployee(day);
                    break;
                case 2:
                    partTimeEmployee(day);
                    break;
                default:
                    absentEmployee(day);
                    break;
            }
            empWage = empHours * EMP_RATE_PER_HOUR;
            System.out.printf("Worked: %d hours, Earned: $%d", empHours, empWage).println("\n");
            totalWage += empWage;
            workingHours += empHours;
        }
        totalWage(comp, totalWage);
        maxWorkingHours(comp, workingHours);
        System.out.println();
    }

    public static void totalWage(String comp, int wage){
        System.out.printf("The Total wage earned by %s for this month: " + "$ " + wage, comp).println();
    }
    public static void maxWorkingHours(String comp, int workingHours){
        System.out.printf("Total hours worked for %s: " + workingHours, comp).println();
    }

    public static void main(String args[]) {
        //Welcome message
        System.out.println("Welcome to Employee Wage Calculator. \n");
        System.out.println("Employee Wage Builder for TCS: \n");
        companyWage("TCS",20,20,100);
        System.out.println("Employee Wage Builder for Microsoft: \n");
        companyWage("Toyota",30,25,120);
    }
}
