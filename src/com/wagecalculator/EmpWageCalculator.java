package com.wagecalculator;

import java.util.Random;

public class EmpWageCalculator {
    public static void main(String args[]) {
        System.out.println("Welcome to Employee Wage Calculator");
        int IS_FULL_TIME=1;
        int WAGE_PER_HOUR=20;
        int totalHours=0;
        int totalWage=0;
        Random random=new Random();
        int empStatus=random.nextInt(2);
        if(empStatus==IS_FULL_TIME) {
            System.out.println("Employee is present");
            totalHours=8;

        }
        else {
            System.out.println("Employee is absent");
            totalHours=4;
        }
        totalWage=totalHours*WAGE_PER_HOUR;
        System.out.println("The Total daily wage of Employee is: "+ totalWage);
    }
}
