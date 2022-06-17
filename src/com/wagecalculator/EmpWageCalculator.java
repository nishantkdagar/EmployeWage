package com.wagecalculator;

import java.util.Random;

public class EmpWageCalculator {
    public static void main(String args[]) {
        System.out.println("Welcome to Employee Wage Calculator");
        int IS_FULL_TIME=1;
        Random random=new Random();
        int empStatus=random.nextInt(2);
        if(empStatus==IS_FULL_TIME) {
            System.out.println("Employee is present");
        }
        else {
            System.out.println("Employee is absent");
        }
    }
}
